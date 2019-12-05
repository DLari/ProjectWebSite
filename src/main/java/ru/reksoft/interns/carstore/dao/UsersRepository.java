package ru.reksoft.interns.carstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.reksoft.interns.carstore.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users getById (Integer id);
}
