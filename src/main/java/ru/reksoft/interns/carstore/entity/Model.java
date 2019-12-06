package ru.reksoft.interns.carstore.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name="model")
public class Model {

    @OneToMany(mappedBy = "model")
    private List<AutoInStock> autoInStocks;

    @ManyToOne
    @JoinColumn(name = "dict_carcass_id")
    private DictCarcass dictCarcass;

    @OneToMany(mappedBy = "model")
    private List<Engine> engines;

    @Id
   // @GeneratedValue
    @Column( name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column( name = "width_carcass")
    private String widthCarcass;

    @Column(name = "length_carcass")
    private String lenghtCarcass;

    @Column( name = "removed")
    private Boolean removed;

/* engine_id
dict_carcass_id*/
}