package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.reksoft.interns.carstore.dao.ColorRepository;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    @Autowired
    ColorRepository colorRepository;

    @Transactional
    public void testCrudRepositoryy() {
        Optional<Color> colorOptional = colorRepository.findById(2L);
    }

    @Transactional
    public void testfindColorWithMoreThanPrice() {
        List<Color> colors = colorRepository.findColorWithMoreThanPrice(40_000L, Sort.by("name"));
    }



}
