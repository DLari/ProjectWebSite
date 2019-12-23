package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.entety.Orders;
import ru.reksoft.interns.projectwebstore.mapper.OrdersMapper;
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

    public Integer create(OrdersDto newOrder) {
        Integer id=newOrder.getId();
        ordersRepository.saveAndFlush(ordersMapper.toEntity(newOrder));
        return id;
    }

//    public Integer update(Integer id, OrdersDto ordersDto) {
//        Integer reternId=id;
//        Orders orders= ordersRepository.getById(id);
//        ordersMapper.updateEngine(ordersDto,orders);
//        return reternId;
//    }

    public void delete(Integer id) {
        Orders orders=ordersRepository.getById(id);
        orders.getDictOrderStatus().setName("in the process");
        ordersRepository.saveAndFlush(orders);
    }
}
