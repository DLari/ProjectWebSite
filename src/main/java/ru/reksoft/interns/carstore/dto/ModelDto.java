package ru.reksoft.interns.carstore.dto;

import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.entity.DictCarcass;
import ru.reksoft.interns.carstore.entity.Engine;

import java.math.BigDecimal;
import java.util.List;

public class ModelDto {

    private Integer id;

    private String name;

    private BigDecimal price;

    private String widthCarcass;

    private String lenghtCarcass;

    private Boolean removed;

    private DictCarcass dictCarcass;

    private List<AutoInStock> autoInStocks;

    private List<Engine> engines;

//    public void setEngines(List<Engine> engines) {
//        this.engines = engines;
//    }
//
//    public List<Engine> getEngines() {
//        return engines;
//    }
//
//    public void setAutoInStocks(List<AutoInStock> autoInStocks) {
//        this.autoInStocks = autoInStocks;
//    }
//
//    public List<AutoInStock> getAutoInStocks() {
//        return autoInStocks;
//    }
//
    public void setDictCarcass(DictCarcass dictCarcass) {
        this.dictCarcass = dictCarcass;
    }

    public DictCarcass getDictCarcass() {
        return dictCarcass;
    }

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

    public void setWidthCarcass(String widthCarcass) {
        this.widthCarcass = widthCarcass;
    }

    public String getWidthCarcass() {
        return widthCarcass;
    }

    public void setLenghtCarcass(String lenghtCarcass) {
        this.lenghtCarcass = lenghtCarcass;
    }

    public String getLenghtCarcass() {
        return lenghtCarcass;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    public Boolean getRemoved() {
        return removed;
    }
}
