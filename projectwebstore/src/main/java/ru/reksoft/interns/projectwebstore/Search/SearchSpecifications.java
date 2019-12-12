package ru.reksoft.interns.projectwebstore.Search;


import org.springframework.data.jpa.domain.Specification;
import ru.reksoft.interns.projectwebstore.entety.*;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock_;
import ru.reksoft.interns.projectwebstore.entety.Color_;
import ru.reksoft.interns.projectwebstore.entety.DictCarcass_;
import ru.reksoft.interns.projectwebstore.entety.Engine_;
import ru.reksoft.interns.projectwebstore.entety.Model_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SearchSpecifications {

    public static Specification<AutoInStock> findColorId(Integer id) {
    return new Specification<AutoInStock>() {

        public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
          if(id==null) {
              return cb.and();
          }
          else {
              return cb.equal(root.get(AutoInStock_.color).get(Color_.id),id);
          }
        }
    };
}
        public static Specification<AutoInStock> findModelId(Integer id) {
        return new Specification<AutoInStock>() {

            public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                if (id == null) {
                    return cb.and();
                } else {
                    return cb.equal(root.get(AutoInStock_.model).get(ru.reksoft.interns.projectwebstore.entety.Model_.id),id);
                }
                }
            };
        }

    public static Specification<AutoInStock> findEngineId(Integer id) {
        return new Specification<AutoInStock>() {

            public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                if (id == null) {
                    return cb.and();
                } else {
                    return cb.equal(root.get(AutoInStock_.engine).get(Engine_.id), id);
                }
            }
        };
    }
    public static Specification<AutoInStock> findCarcassId(Integer id) {
        return new Specification<AutoInStock>() {

            public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                if (id == null) {
                    return cb.and();
                } else {
                    return cb.equal(root.get(AutoInStock_.model).get(Model_.dictCarcass).get(DictCarcass_.id), id);
                }
            }
        };
    }

}
