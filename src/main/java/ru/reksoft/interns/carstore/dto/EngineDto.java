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

   // private Boolean removed;

    private Integer power;

    private Integer fuelConsumption;

    private  ModelDto model;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
