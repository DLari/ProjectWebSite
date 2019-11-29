package ru.reksoft.interns.carstore.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

@Entity
@Setter
@Getter
@Table(name="color")
public class Color {



    @Id
  //  @NotNull
    @GeneratedValue
   /* @Setter
    @Getter*/
   @Column(name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column( name = "name")
    private String name;

   // @Positive
    @Setter
    @Getter
    @Column(name = "price")
    private BigDecimal price;

    @Setter
    @Getter
    @Column(name = "removed")
    private Boolean removed;
}