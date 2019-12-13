package ru.reksoft.interns.projectwebstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.EngineMapper;
import ru.reksoft.interns.projectwebstore.Search.SearchSpecifications;
import ru.reksoft.interns.projectwebstore.dao.EngineRepository;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;
import ru.reksoft.interns.projectwebstore.entety.Engine;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EngineService {

    @Autowired
    private EngineRepository engineRepository;

    @Autowired
    private EngineMapper engineMapper;

    public EngineDto getEngine(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return engineMapper.toDto(engineRepository.getById(id));
    }

    public List<EngineDto> findEngineAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return engineRepository.findAll(SearchSpecifications.findAllNotRemovedEngine()).stream().map(engineMapper::toDto).collect(Collectors.toList());
    }

    public Integer create(EngineDto newEngine) {
        Integer id=newEngine.getId();
        engineRepository.saveAndFlush(engineMapper.toEntity(newEngine));
        return id;
    }

    public Integer update(Integer id, EngineDto engineDto) {
        Integer reternId=id;
        Engine engine= engineRepository.getById(id);
        //colorRepository.saveAndFlush(colorMapper.toEntity(colorDTO));


        engine.setName(engineDto.getName());
        engine.setPrice(engineDto.getPrice());
        engine.setRemoved(engineDto.getRemoved());
        engine.setFuelConsumption(engineDto.getFuelConsumption());
        engine.setPower(engineDto.getPower());
        engineRepository.saveAndFlush(engine);
        return reternId;
    }

    public void delete(Integer id) {
        Engine engine= engineRepository.getById(id);
        engine.setRemoved(true);
        engineRepository.saveAndFlush(engine);
    }
}
