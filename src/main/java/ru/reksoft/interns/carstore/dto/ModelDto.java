package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.entity.DictCarcass;
import ru.reksoft.interns.carstore.entity.Engine;

import java.math.BigDecimal;
import java.util.List;

public class ModelDto {

    @Setter
    @Getter
    private Integer id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private BigDecimal price;

    private Boolean removed;

//    @Setter
//    @Getter
//    private String carcassName;

    @Setter
    @Getter
    private DictCarcassDto dictCarcass;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDictCarcass(DictCarcassDto dictCarcass) {
        this.dictCarcass = dictCarcass;
    }

    public DictCarcassDto getDictCarcass() {
        return dictCarcass;
    }
}
