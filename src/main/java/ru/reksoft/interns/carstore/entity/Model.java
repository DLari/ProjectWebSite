package ru.reksoft.interns.carstore.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="model")
public class Model {

    @ManyToOne
    @JoinColumn(name = "auto_in_stock")
    private AutoInStock autoInStock;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "model")
    private Set<Engine> engines = new HashSet<>();

    @OneToMany( cascade = CascadeType.ALL, mappedBy = "model")
    private Set<DictCarcass> dictCarcasses = new HashSet<>();



    @Id
    @GeneratedValue
    @Setter
    @Getter
    @Column( name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column(name = "id")
    private String name;

    @Setter
    @Getter
    @Column(name = "price")
    private BigDecimal price;

    @Setter
    @Getter
    @Column( name = "width_carcass")
    private String widthCarcass;

    @Setter
    @Getter
    @Column(name = "lenght_carcass")
    private String lenghtCarcass;

    @Setter
    @Getter
    @Column( name = "removed")
    private Boolean removed;

/* engine_id
dict_carcass_id*/
}