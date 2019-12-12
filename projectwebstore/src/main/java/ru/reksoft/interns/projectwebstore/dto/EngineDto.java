package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class EngineDto {

//   public EngineDto(Integer id, String name, BigDecimal price, Integer power, Integer fuelConsumption){
//        this.id=id;
//        this.name=name;
//        this.price=price;
//        this.power=power;
//        this.fuelConsumption=fuelConsumption;
//    };

    private Integer id;

    private String name;

    private BigDecimal price;

    private Boolean removed;

    private Integer power;

    private Integer fuelConsumption;

    private  ModelDto model;

}
