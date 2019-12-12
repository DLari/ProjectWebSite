package ru.reksoft.interns.projectwebstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;
import ru.reksoft.interns.projectwebstore.entety.Engine;

import java.util.Objects;

@Component
public class EngineMapper {

    @Autowired
    private ModelMapper modelMapper;

    // @Override
    public Engine toEntity(EngineDto dto) {
        return
                //Objects.isNull(dto) ? null :
                modelMapper.map(dto, Engine.class);
    }

    public EngineDto toDto(Engine entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, EngineDto.class);
    }


}
