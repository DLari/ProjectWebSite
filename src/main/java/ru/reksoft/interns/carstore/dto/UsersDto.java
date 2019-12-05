package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.Orders;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class UsersDto {

    private List<Orders> orders;

    private Integer id;

    private String fio;

    private Date dateOfBirth;

    private String login;

    private String password;

    private String rule;

}
