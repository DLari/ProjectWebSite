package ru.reksoft.interns.projectwebstore.search;


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

    public static Specification<Color> findAllNotRemovedColor() {
        return new Specification<Color>() {

            public Predicate toPredicate(Root<Color> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.isFalse(root.get(Color_.removed));
            }
        };
    }

    public static Specification<Engine> findAllNotRemovedEngine() {
        return new Specification<Engine>() {

            public Predicate toPredicate(Root<Engine> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.isFalse(root.get(Engine_.removed));
            }
        };
    }

    public static Specification<Model> findAllNotRemovedModel() {
        return new Specification<Model>() {

            public Predicate toPredicate(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                return cb.isFalse(root.get(Model_.removed));
            }
        };
    }
}
