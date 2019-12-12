package ru.reksoft.interns.projectwebstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.DictCarcassDto;
import ru.reksoft.interns.projectwebstore.entety.DictCarcass;

import java.util.Objects;

@Component
public class DictCarcassMapper {

    @Autowired
    private ModelMapper modelMapper;

    public DictCarcass toEntity(DictCarcassDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, DictCarcass.class);
    }

    public DictCarcassDto toDto(DictCarcass entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, DictCarcassDto.class);
    }

}
