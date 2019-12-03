package ru.reksoft.interns.carstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.Objects;

@Component
public class ColorMapper {

    @Autowired
    private ModelMapper mapper;


   // @Override
    public Color toEntity(ColorDTO dto) {
        return Objects.isNull(dto) ? null : mapper.map(dto, Color.class);
    }



   // @Override
    public ColorDTO toDto(Color entity) {
        return Objects.isNull(entity) ? null : mapper.map(entity, ColorDTO.class);
    }

}
