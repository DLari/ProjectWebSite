package ru.reksoft.interns.carstore.dao;

import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.StringExpression;
import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.carstore.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long>,
       // CrudRepository<Model,Long>,
        //QuerydslPredicateExecutor<Model>
        JpaSpecificationExecutor<Model>
        {

    Model getById (Integer id);
}
