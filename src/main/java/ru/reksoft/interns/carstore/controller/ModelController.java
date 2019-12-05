package ru.reksoft.interns.carstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.carstore.dto.ModelDto;
import ru.reksoft.interns.carstore.service.ModelService;

import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ModelDto modelDto;

    @Autowired
    private ModelService modelService;

    @GetMapping("/{id}")
    public ModelDto getDictCarcass(@PathVariable Integer id) {
        return modelService.getModel(id);
    }


    @GetMapping("/all")
    public List<ModelDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return modelService.findModelAll();
    }

}
