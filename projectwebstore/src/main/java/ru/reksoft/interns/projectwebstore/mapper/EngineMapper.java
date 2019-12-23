package ru.reksoft.interns.projectwebstore.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dao.EngineRepository;
import ru.reksoft.interns.projectwebstore.dao.ModelRepository;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;
import ru.reksoft.interns.projectwebstore.dto.ModelDto;
import ru.reksoft.interns.projectwebstore.entety.Engine;

import java.util.Objects;

@Component
public class EngineMapper {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EngineRepository engineRepository;

    @Autowired
    private ModelRepository modelRepository ;

    // @Override
    public Engine toEntity(EngineDto dto) {
        return
                //Objects.isNull(dto) ? null :
                modelMapper.map(dto, Engine.class);
    }

    public EngineDto toDto(Engine entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, EngineDto.class);
    }

    public Engine updateEngine(EngineDto engineDto, Engine engine) {
        //
        // engine.setModel(modelRepository.getById(engineDto.getModel().getId()));
        engine.setName(engineDto.getName());
        engine.setPrice(engineDto.getPrice());
        engine.setRemoved(engineDto.getRemoved());
        engine.setFuelConsumption(engineDto.getFuelConsumption());
        engine.setPower(engineDto.getPower());
        engineRepository.saveAndFlush(engine);
        return engine;
    }

}
