//package ru.reksoft.interns.carstore.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import ru.reksoft.interns.carstore.entity.Model;
//
//import java.util.List;
//
//public interface ModelRepositoryTest extends JpaRepository<Model, Long>, JpaSpecificationExecutor<Model> {
//    @Query( "SELECT m.name, m.price FROM model AS m" +
//            "JOIN dict_carcass.id" +
//            "WHERE dict_carcass.name= ?Name")
//    List<Model> findAllAutoWithCarcass(@Param("Name") String name);
//}
