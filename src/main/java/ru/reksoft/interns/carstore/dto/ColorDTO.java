package ru.reksoft.interns.carstore.dto;

import java.math.BigDecimal;

public class ColorDTO {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Boolean removed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Boolean getRemoved() {
        return removed;
    }

   public void setRemoved(Boolean removed) {
        this.removed = removed;
    }
}
