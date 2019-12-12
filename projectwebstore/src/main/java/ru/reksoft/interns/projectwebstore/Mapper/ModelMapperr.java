package ru.reksoft.interns.projectwebstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.ModelDto;
import ru.reksoft.interns.projectwebstore.entety.Model;

import java.util.Objects;

@Component
public class ModelMapperr {

   @Autowired
   private ModelMapper modelMapper;

    public Model toEntity(ModelDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Model.class);
    }

    public ModelDto toDto(Model entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, ModelDto.class);
    }
}
