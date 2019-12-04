//package ru.reksoft.interns.carstore.dao;
//
//import org.springframework.data.repository.Repository;
//
//import java.io.Serializable;
//import java.util.Optional;
//
//
//public interface CrudRepository <T, ID extends Serializable>
//        extends Repository<T, ID> {
//
//
//
//    <S extends T> S save(S entity);
//
//    Optional<T> findById(ID primaryKey);
//
//    Iterable<T> findAll();
//
//    Long count();
//
//    void delete(T entity);
//
//    boolean exists(ID primaryKey);
//}
