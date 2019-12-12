package ru.reksoft.interns.projectwebstore.dto;

import lombok.*;

import java.math.BigDecimal;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data

//@Setter
//@Getter
public class ColorDTO {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Boolean removed;

//  public   ColorDTO(Integer id, String name, BigDecimal price, Boolean removed) {
//        this.id=id;
//        this.name=name;
//        this.price=price;
//        this.removed=removed;
//    }
//
//    public ColorDTO( String name, BigDecimal price) {
//        this.name=name;
//        this.price=price;
//    }

    public Integer getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Boolean getRemoved() {
        return removed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }
}