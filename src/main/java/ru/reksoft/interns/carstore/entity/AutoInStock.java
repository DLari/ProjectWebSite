package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="auto_in_stock")
public class AutoInStock {

   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "auto_in_stock")
    private List<Color> colors;*/

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @OneToMany(  cascade = CascadeType.ALL, mappedBy = "auto_in_stock")
    private List<Engine> engines;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auto_in_stock")
    private List<Model> models;

    @Id
    @GeneratedValue
    @Setter
    @Getter
   @Column(name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column(name = "presence")
    private Integer presence;

/*
engine_id
model_id */

}