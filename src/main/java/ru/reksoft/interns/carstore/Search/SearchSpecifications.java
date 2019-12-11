package ru.reksoft.interns.carstore.Search;


import org.springframework.data.jpa.domain.Specification;
import ru.reksoft.interns.carstore.entity.*;
import ru.reksoft.interns.carstore.entity.AutoInStock_;
import ru.reksoft.interns.carstore.entity.Color_;
import ru.reksoft.interns.carstore.entity.DictCarcass_;
import ru.reksoft.interns.carstore.entity.Engine_;
import ru.reksoft.interns.carstore.entity.Model_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;


public class SearchSpecifications {

    // ?? надо через авто
//    public static Specification<Model> modelName(String name) {
//        return new Specification<Model>() {
//
//            public Predicate toPredicate(Root<Model> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//                return cb.equal(root.get(Model_.name),name);
//                        //cb.equal(root.get(Model_.NAME), name);
//            }
//        };
//    }

//builder.equal(root.get(AutoInStock_.color).get(Color_id), filter.getColorId());

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

//    public static Specification<AutoInStock> modelPrice(BigDecimal price) {
//        return new Specification<AutoInStock>() {
//
//            public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
//               return cb.equal(root.get(AutoInStock_.model).get(Model_.PRICE),price);
//                       //cb.lessThan(root.get(AutoInStock_.modelId).get(Model_.price), price);
//            }
//        };
//    }

        public static Specification<AutoInStock> findModelId(Integer id) {
        return new Specification<AutoInStock>() {

            public Predicate toPredicate(Root<AutoInStock> root, CriteriaQuery<?> query, CriteriaBuilder cb) {

                if (id == null) {
                    return cb.and();
                } else {
                    return cb.equal(root.get(AutoInStock_.model).get(Model_.id),id);
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
