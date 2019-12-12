package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
public class AutoInStockDto {

    private Integer id;

    private Integer presence;

    private ModelDto model;

    private ColorDTO color;

    private EngineDto engine;
}