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
}