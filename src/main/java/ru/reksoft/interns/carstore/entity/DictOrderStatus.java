package ru.reksoft.interns.carstore.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name="dict_order_status")
public class DictOrderStatus {

  /*  @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;*/

 /*   @OneToMany(mappedBy = "dict_order_status")
    private List<Orders> orders;*/

    @Id
    //@GeneratedValue
   @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}

