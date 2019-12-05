package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.Color;
import ru.reksoft.interns.carstore.entity.Engine;
import ru.reksoft.interns.carstore.entity.Model;

import java.math.BigDecimal;

public class AutoInStockDto {

    @Setter
    @Getter
    private Integer id;

    @Setter
    @Getter
    private Integer presence;

    @Setter
    @Getter
    private String colorName;

    @Setter
    @Getter
    private BigDecimal colorPrice;

    @Setter
    @Getter
    private String engineName;

    @Setter
    @Getter
    private BigDecimal enginePrice;

//    @Setter
//    @Getter
//    private Integer engineFuel_Consumption;
//
//    @Setter
//    @Getter
//    private Integer enginePower;

    @Setter
    @Getter
    private String modelName;

    @Setter
    @Getter
    private BigDecimal modelPrice;
}
