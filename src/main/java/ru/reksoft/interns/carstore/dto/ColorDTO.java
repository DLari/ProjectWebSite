package ru.reksoft.interns.carstore.dto;

import lombok.*;

import java.math.BigDecimal;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data

@Setter
@Getter
public class ColorDTO {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Boolean removed;

//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
}
