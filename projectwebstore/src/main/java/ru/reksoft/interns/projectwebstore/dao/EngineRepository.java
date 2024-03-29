package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.Engine;

@Repository
public interface EngineRepository extends JpaRepository<Engine, Long>, JpaSpecificationExecutor<Engine> {
    Engine getById (Integer id);
}
