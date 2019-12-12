package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    Users getById (Integer id);
}
