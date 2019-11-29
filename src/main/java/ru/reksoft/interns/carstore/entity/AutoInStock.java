package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name="auto_in_stock")
public class AutoInStock {

    @OneToMany(mappedBy = "autoInStock")
    private List<Orders> orders;

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "engine_id")
    private Engine engine ;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;



    @Id
    //@GeneratedValue
   @Column(name = "id")
    private Integer id;

    @Column(name = "presence")
    private Integer presence;

/*
engine_id
model_id */

}