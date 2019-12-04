package ru.reksoft.interns.carstore.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="color")
public class Color {

 /*@OneToMany(mappedBy = "color")
    private List<AutoInStock> autoInStocks;*/

    @Id
  //  @NotNull
    //@GeneratedValue
   @Column(name = "id")
    private Integer id;


    @Column( name = "name")
    private String name;

   // @Positive

    @Column(name = "price")
    private BigDecimal price;


    @Column(name = "removed")
    private Boolean removed;

//    public Integer getId() {
//        return id;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Boolean getRemoved() {
//        return removed;
//    }
}