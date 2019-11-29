package ru.reksoft.interns.carstore.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="dict_order_status")
public class DictOrderStatus {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orders;

    @Id
    @GeneratedValue
    @Setter
    @Getter
   @Column(name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column(name = "name")
    private String name;

}

