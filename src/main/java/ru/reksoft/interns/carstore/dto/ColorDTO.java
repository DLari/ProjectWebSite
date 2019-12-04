package ru.reksoft.interns.carstore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class ColorDTO {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Boolean removed;

//    public ColorDTO(Integer id, String name, BigDecimal price, Boolean removed){
//        this.id=id;
//        this.name=name;
//        this.price=price;
//        this.removed=removed;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
//
    public String getName() {
        return name;
    }
//
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
//
    public BigDecimal getPrice() {
        return price;
    }
//
    public Boolean getRemoved() {
        return removed;
    }
//
   public void setRemoved(Boolean removed) {
        this.removed = removed;
    }
}
