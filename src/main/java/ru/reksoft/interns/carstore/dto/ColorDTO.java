package ru.reksoft.interns.carstore.dto;

import lombok.*;

import java.math.BigDecimal;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class ColorDTO {

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
    private Boolean removed;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
