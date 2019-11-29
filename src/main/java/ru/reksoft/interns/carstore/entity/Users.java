package ru.reksoft.interns.carstore.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue
    @Setter
    @Getter
    @Column(name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column(name = "fio")
    private String fio;

    @Setter
    @Getter
    @Column( name = "date_of_birth")
    private Date dateOfBirth;

    @Setter
    @Getter
    @Column( name = "login")
    private String login;

    @Setter
    @Getter
    @Column(name = "password")
    private String password;

    @Setter
    @Getter
    @Column( name = "rule")
    private Enum rule;
}