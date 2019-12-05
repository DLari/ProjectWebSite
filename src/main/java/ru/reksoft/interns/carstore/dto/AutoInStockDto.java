package ru.reksoft.interns.carstore.dto;

import lombok.Getter;
import lombok.Setter;
import ru.reksoft.interns.carstore.entity.Color;
import ru.reksoft.interns.carstore.entity.Engine;
import ru.reksoft.interns.carstore.entity.Model;

@Setter
@Getter
public class AutoInStockDto {

    private Integer id;

    private Integer presence;

    private Color color;

    private Engine engine ;

    private Model model;

}
