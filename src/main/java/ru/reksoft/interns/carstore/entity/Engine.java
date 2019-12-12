package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Setter
@Getter
@Table( name="engine")
public class Engine {

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Id
    @Column( name = "id")
    private Integer id;

    @Column( name = "name")
    private String name;

    @Column( name = "price")
    private BigDecimal price;

    @Column(name = "removed")
    private Boolean removed;

    @Column( name = "power")
    private Integer power;

    @Column(name = "fuel_сonsumption")
    private Integer fuelConsumption;

//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public Integer getFuelConsumption() {
//        return fuelConsumption;
//    }
//
//    public Integer getPower() {
//        return power;
//    }
}