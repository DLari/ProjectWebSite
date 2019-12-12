package ru.reksoft.interns.projectwebstore.entety;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


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



}