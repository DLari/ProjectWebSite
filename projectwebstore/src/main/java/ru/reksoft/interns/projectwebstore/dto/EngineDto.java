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

    public Boolean getRemoved() {
        return removed;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
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

    public ModelDto getModel() {
        return model;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }
}
