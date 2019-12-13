package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.ModelMapperr;
import ru.reksoft.interns.projectwebstore.Search.SearchSpecifications;
import ru.reksoft.interns.projectwebstore.dao.ModelRepository;
import ru.reksoft.interns.projectwebstore.dto.ModelDto;
import ru.reksoft.interns.projectwebstore.entety.Model;

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
        return modelRepository.findAll(SearchSpecifications.findAllNotRemovedModel()).stream().map(modelMapper::toDto).collect(Collectors.toList());
    }

    public Integer create(ModelDto newModel) {
        Integer id=newModel.getId();
        modelRepository.saveAndFlush(modelMapper.toEntity(newModel));
        return id;
    }

    public Integer update(Integer id, ModelDto modelDTO) {
        Integer reternId=id;
        Model model= modelRepository.getById(id);
        //colorRepository.saveAndFlush(colorMapper.toEntity(colorDTO));


        model.setName(modelDTO.getName());
        model.setPrice(modelDTO.getPrice());
        model.setRemoved(modelDTO.getRemoved());
        model.setLenghtCarcass(modelDTO.getLenghtCarcass());
        model.setWidthCarcass(modelDTO.getWidthCarcass());
        modelRepository.saveAndFlush(model);
        return reternId;
    }

    public void delete(Integer id) {
        Model model= modelRepository.getById(id);
        model.setRemoved(true);
        modelRepository.saveAndFlush(model);
    }
}





