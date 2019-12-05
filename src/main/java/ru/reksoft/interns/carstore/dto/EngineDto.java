package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.Model;

import java.math.BigDecimal;

@Setter
@Getter
public class EngineDto {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Boolean removed;

    private Integer power;

    private Integer fuelConsumption;

   // private  Model model;

}
