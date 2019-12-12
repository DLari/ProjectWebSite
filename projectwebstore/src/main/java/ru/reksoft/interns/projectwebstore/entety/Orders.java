package ru.reksoft.interns.projectwebstore.entety;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;



@Setter
@Getter
@Entity
@Table( name="orders")
public class Orders {

    @ManyToOne
    @JoinColumn(name = "auto_in_stock_id")
    private AutoInStock autoInStock;


    @ManyToOne
    @JoinColumn(name = "dict_order_status_id")
    private DictOrderStatus dictOrderStatus;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users users;



    @Id
  //  @GeneratedValue
   @Column( name = "id")
    private Integer id;

    @Column(name = "price")
    private BigDecimal price;

    @Column( name = "date")
    private Date date;

/* client_id
auto_in stock_id*/

}