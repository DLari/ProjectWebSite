package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Setter
@Getter
@Entity
@Table(name="auto_in_stock")
public class AutoInStock {

    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "engine_id")
    private Engine engine ;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @Id
    //@GeneratedValue
   @Column(name = "id")
    private Integer id;

    @Column(name = "presence")
    private Integer presence;

//    public Integer getId() {
//        return id;
//    }
//
//    public Integer getPresence() {
//        return presence;
//    }
//
//    public Model getModel() {
//        return model;
//    }
//
//    public void setModel(Model model) {
//        this.model = model;
//    }
//
//    public void setColor(Color color) {
//        this.color = color;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public Engine getEngine() {
//        return engine;
//    }
    /*
engine_id
model_id */

}