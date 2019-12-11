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

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getLenghtCarcass() {
        return lenghtCarcass;
    }

    public DictCarcass getDictCarcass() {
        return dictCarcass;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDictCarcass(DictCarcass dictCarcass) {
        this.dictCarcass = dictCarcass;
    }

    /* engine_id
dict_carcass_id*/
}