package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;
import ru.reksoft.interns.projectwebstore.service.EngineService;

import java.util.List;

@RestController
@RequestMapping("/engines")
public class EngineController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EngineService engineService;

    @GetMapping("/{id}")
    public EngineDto getDictCarcass(@PathVariable Integer id) {
        return engineService.getEngine(id);
    }


    @GetMapping("")
    public List<EngineDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return engineService.findEngineAll();
    }

}