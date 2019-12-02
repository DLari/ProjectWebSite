package ru.reksoft.interns.carstore.dao;

import java.util.List;

public interface CustomizedColor<T> {
    List <T>getColorListWithMaxPrice();
}
