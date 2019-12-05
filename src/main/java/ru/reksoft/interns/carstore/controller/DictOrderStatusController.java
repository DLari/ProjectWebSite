package ru.reksoft.interns.carstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.carstore.dto.DictOrderStatusDto;
import ru.reksoft.interns.carstore.service.DictOrderStatusService;

import java.util.List;

@RestController
@RequestMapping("/orderStatus")
public class DictOrderStatusController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DictOrderStatusDto dictOrderStatusDto;

    @Autowired
    private DictOrderStatusService dictOrderStatusService;

    @GetMapping("/{id}")
    public DictOrderStatusDto getDictCarcass(@PathVariable Integer id) {
        return dictOrderStatusService.getDictCarcass(id);
    }


    @GetMapping("/all")
    public List<DictOrderStatusDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return dictOrderStatusService.findDictCarcassAll();
    }

}
