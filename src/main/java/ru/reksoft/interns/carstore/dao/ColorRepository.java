package ru.reksoft.interns.carstore.dao;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long>,CustomizedColor<Color>{
//    Optional<Color> findByFirstName(String firtsName);

   // Collection<Color> findByFirstName(String name);

    @Query("select e from Color e where e.price > :price")
    List<Color> findColorWithMoreThanPrice(@Param("price") Long salary, Sort sort);


//    Color findOne(Long id);
}
