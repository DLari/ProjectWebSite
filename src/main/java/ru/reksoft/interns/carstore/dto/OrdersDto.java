package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.entity.DictOrderStatus;
import ru.reksoft.interns.carstore.entity.Users;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class OrdersDto {

    private AutoInStock autoInStock;

    private DictOrderStatus dictOrderStatus;

    private Users users;

    private Integer id;

    private BigDecimal price;

    private Date date;
}
