package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock;

@Repository
public interface AutoInStockRepository extends JpaRepository<AutoInStock, Long>, JpaSpecificationExecutor<AutoInStock> {
    AutoInStock getById (Integer id);
}