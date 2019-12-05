package ru.reksoft.interns.carstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.carstore.dto.DictCarcassDto;
import ru.reksoft.interns.carstore.service.DictCarcassService;

import java.util.List;

@RestController
@RequestMapping("/carcass")
public class DictCarcassController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DictCarcassDto dictCarcassDto;

    @Autowired
    private DictCarcassService dictCarcassService;

    @GetMapping("/{id}")
    public DictCarcassDto getDictCarcass(@PathVariable Integer id) {
        return dictCarcassService.getDictCarcass(id);
    }


    @GetMapping("/all")
    public List<DictCarcassDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return dictCarcassService.findDictCarcassAll();
    }


}
