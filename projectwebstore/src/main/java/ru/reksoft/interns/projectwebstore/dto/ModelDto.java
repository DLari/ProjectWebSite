package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ModelDto {

    private Integer id;

    private String name;

    private BigDecimal price;

    private String widthCarcass;

    private String lenghtCarcass;

    private Boolean removed;

    private DictCarcassDto dictCarcass;

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

    public DictCarcassDto getDictCarcass() {
        return dictCarcass;
    }

    public void setDictCarcass(DictCarcassDto dictCarcass) {
        this.dictCarcass = dictCarcass;
    }

    public String getWidthCarcass() {
        return widthCarcass;
    }

    public void setWidthCarcass(String widthCarcass) {
        this.widthCarcass = widthCarcass;
    }

    public String getLenghtCarcass() {
        return lenghtCarcass;
    }

    public void setLenghtCarcass(String lenghtCarcass) {
        this.lenghtCarcass = lenghtCarcass;
    }
}