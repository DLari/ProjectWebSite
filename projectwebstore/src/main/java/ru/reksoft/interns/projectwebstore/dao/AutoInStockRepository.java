package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock;

import java.util.List;

@Repository
public interface AutoInStockRepository extends JpaRepository<AutoInStock, Long>, JpaSpecificationExecutor<AutoInStock>,
        PagingAndSortingRepository<AutoInStock, Long> {
    AutoInStock getById (Integer id);

    List<AutoInStock> findAllBy(Pageable pageable);
}