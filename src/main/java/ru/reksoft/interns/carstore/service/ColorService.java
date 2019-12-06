package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.carstore.Mapper.ColorMapper;
import ru.reksoft.interns.carstore.dao.ColorRepository;
import ru.reksoft.interns.carstore.dto.ColorDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private ColorMapper colorMapper;


    public ColorDTO getColorByName(String name) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return colorMapper.toDto(colorRepository.findByName(name));
    }

    public ColorDTO getById(Integer id){
        return colorMapper.toDto(colorRepository.getById(id));
    }


    public List<ColorDTO> findColorAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return colorRepository.findAll().stream().map(colorMapper::toDto).collect(Collectors.toList());
         //colorMapper.toDto(colorRepository.findAll());
    }





}
