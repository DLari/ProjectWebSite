package ru.reksoft.interns.carstore.dao;

import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface ColorRepository extends JpaRepository<Color, Long>, JpaSpecificationExecutor<Color> {
    Color findByName (String name);
    Color getById(Integer id);

        //,CustomizedColor<Color>{
//    Optional<Color> findByFirstName(String firtsName);

   // Collection<Color> findByFirstName(String name);

//    @Query("select e from Color e where e.price > :price")
//    List<Color> findColorWithMoreThanPrice(@Param("price") Long salary, Sort sort);


//    Color findOne(Long id);
}
