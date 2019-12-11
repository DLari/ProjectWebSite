package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.carstore.Mapper.ModelMapperr;
import ru.reksoft.interns.carstore.Search.SearchSpecifications;
import ru.reksoft.interns.carstore.dao.ModelRepository;
import ru.reksoft.interns.carstore.dto.ModelDto;

import java.util.List;
import java.util.stream.Collectors;



@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private ModelMapperr modelMapper;

    public ModelDto getModel(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return modelMapper.toDto(modelRepository.getById(id));
    }

    public List<ModelDto> findModelAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return modelRepository.findAll().stream().map(modelMapper::toDto).collect(Collectors.toList());
    }

}





