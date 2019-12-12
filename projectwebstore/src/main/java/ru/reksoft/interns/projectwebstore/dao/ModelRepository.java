package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>,
       // CrudRepository<Model,Long>,
        //QuerydslPredicateExecutor<Model>
        JpaSpecificationExecutor<Model>
        {

    Model getById (Integer id);
}
