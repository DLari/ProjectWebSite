package ru.reksoft.interns.projectwebstore.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dao.DictCarcassRepository;
import ru.reksoft.interns.projectwebstore.dao.EngineRepository;
import ru.reksoft.interns.projectwebstore.dao.ModelRepository;
import ru.reksoft.interns.projectwebstore.dto.ModelDto;
import ru.reksoft.interns.projectwebstore.entety.Model;

import java.util.Objects;

@Component
public class ModelMapperr {

   @Autowired
   private ModelMapper modelMapper;

   @Autowired
   private DictCarcassRepository dictCarcassRepository;

   @Autowired
   private ModelRepository modelRepository;

    public Model toEntity(ModelDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Model.class);
    }

    public ModelDto toDto(Model entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, ModelDto.class);
    }

//    public Model createModel(ModelDto modelDto) {
//        Model model;
//        return model;
//    }

    public Model updateModel( ModelDto modelDto, Model model) {
        model.setDictCarcass(dictCarcassRepository.getById(modelDto.getDictCarcass().getId()));
        model.setName(modelDto.getName());
        model.setPrice(modelDto.getPrice());
        model.setRemoved(modelDto.getRemoved());
        model.setLenghtCarcass(modelDto.getLenghtCarcass());
        model.setWidthCarcass(modelDto.getWidthCarcass());
        modelRepository.saveAndFlush(model);
        return model;
    }
}
