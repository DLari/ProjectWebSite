package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class ModelDto {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Boolean removed;

    private DictCarcassDto dictCarcass;

//    public Integer getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public void setDictCarcass(DictCarcassDto dictCarcass) {
//        this.dictCarcass = dictCarcass;
//    }
//
//    public DictCarcassDto getDictCarcass() {
//        return dictCarcass;
//    }
}
