package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.reksoft.interns.carstore.Mapper.ColorMapper;
import ru.reksoft.interns.carstore.dao.ColorRepository;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.List;
import java.util.Optional;

@Service
public class ColorService {

    private final ColorRepository colorRepository;
    private final ColorMapper colorMapper;

    @Autowired
    public ColorService(ColorRepository colorRepository, ColorMapper colorMapper) {
        this.colorRepository = colorRepository;
        this.colorMapper = colorMapper;
    }

   // @Override
    public ColorDTO save(ColorDTO dto) {
        return colorMapper.toDto(colorRepository.save(colorMapper.toEntity(dto)));
    }

   // @Override
 /*   public ColorDTO get(Long id) {
        return colorMapper.toDto(colorRepository.findById(id));
    }*/


    public ColorDTO get(Long id) {
        Color color = colorRepository.getById(id);
        return colorMapper.toDto(color);
    }

   // Optional findById(ID primaryKey);




  /*  @Autowired
    ColorRepository colorRepository;

    @Transactional
    public void testCrudRepositoryy() {
        Optional<Color> colorOptional = colorRepository.findById(2L);
    }

    @Transactional
    public void testfindColorWithMoreThanPrice() {
        List<Color> colors = colorRepository.findColorWithMoreThanPrice(40_000L, Sort.by("name"));
    }*/



}
