package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.OrdersMapper;
import ru.reksoft.interns.projectwebstore.dao.OrdersRepository;
import ru.reksoft.interns.projectwebstore.dto.OrdersDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrdersMapper ordersMapper;

    public OrdersDto getUser(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return ordersMapper.toDto(ordersRepository.getById(id));
    }

    public List<OrdersDto> findUsers() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return ordersRepository.findAll().stream().map(ordersMapper::toDto).collect(Collectors.toList());
    }
}
