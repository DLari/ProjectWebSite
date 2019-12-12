package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
public class OrdersDto {

    private AutoInStockDto autoInStock;

    private DictOrderStatusDto dictOrderStatus;

    private UsersDto users;

    private Integer id;

    private BigDecimal price;

    private Date date;
}
