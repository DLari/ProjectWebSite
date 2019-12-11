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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPresence() {
        return presence;
    }

    public void setPresence(Integer presence) {
        this.presence = presence;
    }

    public void setModel(ModelDto model) {
        this.model = model;
    }

    public ModelDto getModel() {
        return model;
    }

    public void setEngine(EngineDto engine) {
        this.engine = engine;
    }

    public EngineDto getEngine() {
        return engine;
    }

    public ColorDTO getColor() {
        return color;
    }

    public void setColor(ColorDTO color) {
        this.color = color;
    }
}
