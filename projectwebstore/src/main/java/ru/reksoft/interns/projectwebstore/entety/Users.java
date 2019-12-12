package ru.reksoft.interns.projectwebstore.entety;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="users")
public class Users {

    @OneToMany(mappedBy = "users")
    private List<Orders> orders;

    @Id
   // @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "fio")
    private String fio;

    @Column( name = "date_of_birth")
    private Date dateOfBirth;

    @Column( name = "login_client")
    private String login;

    @Column(name = "password_client")
    private String password;

    @Column( name = "rule")
    private String rule;
}