package ru.reksoft.interns.carstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reksoft.interns.carstore.entity.AutoInStock;

public interface AutoInStockRepository extends JpaRepository<AutoInStock, Long> {
    AutoInStock getById (Integer id);
}
