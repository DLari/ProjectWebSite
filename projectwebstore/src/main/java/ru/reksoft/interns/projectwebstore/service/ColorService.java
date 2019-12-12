package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.ColorMapper;
import ru.reksoft.interns.projectwebstore.dao.ColorRepository;
import ru.reksoft.interns.projectwebstore.dto.ColorDTO;
import ru.reksoft.interns.projectwebstore.entety.Color;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private ColorMapper colorMapper;

    public ColorDTO getById(Integer id){
        return colorMapper.toDto(colorRepository.getById(id));
    }

    public List<ColorDTO> findColorAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return colorRepository.findAll().stream().map(colorMapper::toDto).collect(Collectors.toList());
    }

    public Integer create(ColorDTO newColor) {
        Integer id=newColor.getId();
        colorRepository.saveAndFlush(colorMapper.toEntity(newColor));
        return id;
    }

    public Integer update(ColorDTO colorDTO) {
        Integer newId=colorDTO.getId();
       // Color color=colorRepository.getById(id);
        colorRepository.deleteById(newId);
        colorRepository.saveAndFlush(colorMapper.toEntity(colorDTO));
        return newId;
    }

    public void delete(Integer id) {
        colorRepository.deleteById(id);
    }
}
