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

    private Boolean removed;

    private DictCarcassDto dictCarcass;
}