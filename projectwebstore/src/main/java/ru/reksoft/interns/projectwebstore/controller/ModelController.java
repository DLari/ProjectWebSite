package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.ModelDto;
import ru.reksoft.interns.projectwebstore.service.ModelService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/models")
public class ModelController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ModelService modelService;

    @GetMapping("/{id}")
    public ModelDto getDictCarcass(@PathVariable Integer id) {
        return modelService.getModel(id);
    }


    @GetMapping("")
    public List<ModelDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return modelService.findModelAll();
    }
    @PostMapping("")
    public ModelDto create(@RequestBody @Valid ModelDto newModel) {
        return modelService.create(newModel);
    }

    @PutMapping(value = "/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody ModelDto modelDto) {
        Integer updateId= modelService.update(id, modelDto);
        return updateId;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        modelService.delete(id);
    }
}