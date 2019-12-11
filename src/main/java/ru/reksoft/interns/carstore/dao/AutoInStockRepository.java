package ru.reksoft.interns.carstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.reksoft.interns.carstore.entity.AutoInStock;

import java.util.Collection;
import java.util.List;

public interface AutoInStockRepository extends JpaRepository<AutoInStock, Long>, JpaSpecificationExecutor<AutoInStock> {
    AutoInStock getById (Integer id);
   // AutoInStock passportIterator = session.createQuery("from auto_in_stock as a where a.model_id=name")

//    @Query( "SELECT auto_in_stock.id FROM auto_in_stock AS auto " +
//                    "JOIN model ON auto_in_stock.model_id=model.id" +
//                    " WHERE model.name= :name")
//    AutoInStock findAllAutoWithModel( @Param("model.name") String name);

}
//"SELECT auto_in_stock.name,auto_in_stock.price FROM auto_in_stock JOIN model ON auto_in_stock.model_id=model.id WHERE model.name='Sedan'",
//addJoin("model.name",name)