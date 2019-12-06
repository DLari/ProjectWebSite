package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.Color;
import ru.reksoft.interns.carstore.entity.Engine;
import ru.reksoft.interns.carstore.entity.Model;

import java.math.BigDecimal;


@Setter
@Getter
public class AutoInStockDto {

    private Integer id;

    private Integer presence;

    private ModelDto model;

    private  ColorDTO color;

    private EngineDto engine;
}
