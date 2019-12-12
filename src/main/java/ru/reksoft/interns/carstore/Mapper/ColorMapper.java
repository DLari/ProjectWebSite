package ru.reksoft.interns.carstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;

import java.util.Objects;
import java.util.Optional;

@Component
public class ColorMapper {

    @Autowired
    private ModelMapper modelMapper;

   // @Override
    public Color toEntity(ColorDTO dto) {
        return
                //Objects.isNull(dto) ? null :
                modelMapper.map(dto, Color.class);
    }

    public ColorDTO toDto(Color entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, ColorDTO.class);
    }
}
