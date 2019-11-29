package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="dict_carcass")
public class DictCarcass {

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Id
    @GeneratedValue
    @Setter
    @Getter
   @Column(name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column( name = "id")
    private String name;

}