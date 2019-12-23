package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.dao.DictCarcassRepository;
import ru.reksoft.interns.projectwebstore.mapper.ModelMapperr;
import ru.reksoft.interns.projectwebstore.search.SearchSpecifications;
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
    private DictCarcassRepository dictCarcassRepository;

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

    public ModelDto create(ModelDto newModel) {
        modelRepository.saveAndFlush(modelMapper.toEntity(newModel));
        return newModel;
    }

    public Integer update(Integer id, ModelDto modelDTO) {
        Integer reternId=id;
        Model model= modelRepository.getById(id);
        modelMapper.updateModel(modelDTO,model);
        return reternId;
    }

    public void delete(Integer id) {
        Model model= modelRepository.getById(id);
        model.setRemoved(true);
        modelRepository.saveAndFlush(model);
    }
}





