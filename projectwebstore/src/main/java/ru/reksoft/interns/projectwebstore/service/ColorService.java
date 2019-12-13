package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.ColorMapper;
import ru.reksoft.interns.projectwebstore.Search.SearchSpecifications;
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
        return colorRepository.findAll(
                SearchSpecifications.findAllNotRemovedColor()
        ).stream().map(colorMapper::toDto).collect(Collectors.toList());
    }

    public Integer create(ColorDTO newColor) {
        Integer id=newColor.getId();
        colorRepository.saveAndFlush(colorMapper.toEntity(newColor));
        return id;
    }

    public Integer update(Integer id, ColorDTO colorDTO) {
        Integer reternId=id;
        Color color= colorRepository.getById(id);
        //colorRepository.saveAndFlush(colorMapper.toEntity(colorDTO));


        color.setName(colorDTO.getName());
        color.setPrice(colorDTO.getPrice());
        color.setRemoved(colorDTO.getRemoved());
        colorRepository.saveAndFlush(color);
        return reternId;
    }

    public void delete(Integer id) {
       Color color= colorRepository.getById(id);
       color.setRemoved(true);
        colorRepository.saveAndFlush(color);
    }
}
