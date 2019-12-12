package ru.reksoft.interns.projectwebstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    Orders getById (Integer id);
}
