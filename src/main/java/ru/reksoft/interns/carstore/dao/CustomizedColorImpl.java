package ru.reksoft.interns.carstore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/*public class CustomizedColorImpl implements CustomizedColor {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List getColorListWithMaxPrice() {
        return em.createQuery("from Color where price = (select max(price) from Color )", Employees.class
                .getResultList();
    }
}
*/