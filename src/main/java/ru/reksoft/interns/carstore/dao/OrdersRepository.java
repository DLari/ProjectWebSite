package ru.reksoft.interns.carstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reksoft.interns.carstore.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    Orders getById (Integer id);
}
