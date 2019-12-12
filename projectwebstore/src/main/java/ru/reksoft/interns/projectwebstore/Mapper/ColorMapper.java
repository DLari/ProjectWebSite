package ru.reksoft.interns.projectwebstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.ColorDTO;
import ru.reksoft.interns.projectwebstore.entety.Color;

import java.util.Objects;
import java.util.Optional;

@Component
public class ColorMapper {

    @Autowired
    private ModelMapper modelMapper;

   // @Override
    public Color toEntity(ColorDTO dto) {
        return modelMapper.map(dto, Color.class);
    }

    public ColorDTO toDto(Color entity) {
        return modelMapper.map(entity, ColorDTO.class);
    }
//    public ColorDTO toDto(Color entity) {
//        return new ColorDTO(
//                entity.getId(),
//                entity.getName(),
//                entity.getPrice(),
//                entity.getRemoved()
//        );
//    }
}
