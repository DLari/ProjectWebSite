package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table( name="engine")
public class Engine {

    @ManyToOne
    @JoinColumn(name = "auto_in_stock_id")
    private AutoInStock autoInStock;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Id
    @GeneratedValue
    @Setter
    @Getter
    @Column( name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column( name = "name")
    private String name;

    @Setter
    @Getter
    @Column( name = "price")
    private BigDecimal price;

    @Setter
    @Getter
    @Column(name = "removed")
    private Boolean removed;

    @Setter
    @Getter
    @Column( name = "power")
    private Integer power;

    @Setter
    @Getter
    @Column(name = "fuel_consumption")
    private Integer fuelConsumption;

}