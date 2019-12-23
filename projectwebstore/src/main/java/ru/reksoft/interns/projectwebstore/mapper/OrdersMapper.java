package ru.reksoft.interns.projectwebstore.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dao.AutoInStockRepository;
import ru.reksoft.interns.projectwebstore.dao.DictOrderStatusRepository;
import ru.reksoft.interns.projectwebstore.dao.OrdersRepository;
import ru.reksoft.interns.projectwebstore.dao.UsersRepository;
import ru.reksoft.interns.projectwebstore.dto.OrdersDto;
import ru.reksoft.interns.projectwebstore.entety.Orders;

import java.util.Objects;

@Component
public class OrdersMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AutoInStockRepository autoInStockRepository;

    @Autowired
    private DictOrderStatusRepository dictOrderStatusRepository;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    public Orders toEntity(OrdersDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Orders.class);
    }

    public OrdersDto toDto(Orders entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, OrdersDto.class);
    }

//    public Orders updateEngine (OrdersDto ordersDto, Orders orders) {
//        orders.setAutoInStock(autoInStockRepository.getById(ordersDto.getAutoInStock().getId()));
//        orders.setDictOrderStatus(dictOrderStatusRepository.getById(ordersDto.getDictOrderStatus().getId()));
//        orders.setUsers(usersRepository.getById(ordersDto.getUsers().getId()));
//        orders.setDate(ordersDto.getDate());
//        orders.setPrice(ordersDto.getPrice());
//
//
//        ordersRepository.saveAndFlush(orders);
//        return orders;
//    }
}
