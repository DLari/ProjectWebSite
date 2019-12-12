package ru.reksoft.interns.projectwebstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.EngineMapper;
import ru.reksoft.interns.projectwebstore.dao.EngineRepository;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;

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
        return engineRepository.findAll().stream().map(engineMapper::toDto).collect(Collectors.toList());
    }

}
