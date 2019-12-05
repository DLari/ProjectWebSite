package ru.reksoft.interns.carstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reksoft.interns.carstore.entity.DictOrderStatus;

public interface DictOrderStatusRepository  extends JpaRepository<DictOrderStatus, Long> {
    DictOrderStatus getById (Integer id);
}
