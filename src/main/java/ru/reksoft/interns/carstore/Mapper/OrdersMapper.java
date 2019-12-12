package ru.reksoft.interns.carstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.carstore.dto.OrdersDto;
import ru.reksoft.interns.carstore.entity.Orders;

import java.util.Objects;

@Component
public class OrdersMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Orders toEntity(OrdersDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Orders.class);
    }

    public OrdersDto toDto(Orders entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, OrdersDto.class);
    }
}
