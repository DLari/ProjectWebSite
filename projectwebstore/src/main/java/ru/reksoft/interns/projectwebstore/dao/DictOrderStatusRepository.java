package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.DictOrderStatus;

@Repository
public interface DictOrderStatusRepository  extends JpaRepository<DictOrderStatus, Long> {
    DictOrderStatus getById (Integer id);
}
