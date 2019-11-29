package ru.reksoft.interns.carstore.entity;
import ch.qos.logback.core.net.server.Client;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table( name="orders")
public class Orders {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<DictOrderStatus> dictOrderStatuses;


    @Id
    @GeneratedValue
    @Setter
    @Getter
   @Column( name = "id")
    private Integer id;

    @Setter
    @Getter
    @Column(name = "price")
    private BigDecimal price;

    @Setter
    @Getter
    @Column( name = "date")
    private Date date;

/* client_id
auto_in stock_id*/

}