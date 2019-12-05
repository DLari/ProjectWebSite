package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.entity.DictCarcass;
import ru.reksoft.interns.carstore.entity.Engine;

import java.math.BigDecimal;
import java.util.List;

public class ModelDto {

    @Setter
    @Getter
    private Integer id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private BigDecimal price;

    @Setter
    @Getter
    private String widthCarcass;

    @Setter
    @Getter
    private String lenghtCarcass;

    private Boolean removed;

    @Setter
    @Getter
    private String carcassName;


    private List<AutoInStock> autoInStocks;

    private List<Engine> engines;



}
