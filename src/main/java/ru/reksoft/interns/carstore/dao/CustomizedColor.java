package ru.reksoft.interns.carstore.dao;

import ru.reksoft.interns.carstore.entity.Color;

import java.util.List;

public interface CustomizedColor<T> {
   // List <T>getColorListWithMaxPrice();
    Color getById(Long id);
}
