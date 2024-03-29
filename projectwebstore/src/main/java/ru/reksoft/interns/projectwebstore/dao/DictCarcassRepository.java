package ru.reksoft.interns.projectwebstore.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.projectwebstore.entety.DictCarcass;

@Repository
public interface DictCarcassRepository extends JpaRepository<DictCarcass, Long>, JpaSpecificationExecutor<DictCarcass> {
    DictCarcass getById (Integer id);
}
