package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class UsersDto {

    private Integer id;

    private String fio;

    private Date dateOfBirth;

    private String login;

    private String password;

    private String rule;

}
