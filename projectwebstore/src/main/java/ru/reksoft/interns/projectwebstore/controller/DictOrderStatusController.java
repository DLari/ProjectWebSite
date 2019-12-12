package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.projectwebstore.dto.DictOrderStatusDto;
import ru.reksoft.interns.projectwebstore.service.DictOrderStatusService;

import java.util.List;

@RestController
@RequestMapping("/statuses")
public class DictOrderStatusController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DictOrderStatusService dictOrderStatusService;

    @GetMapping("/{id}")
    public DictOrderStatusDto getDictCarcass(@PathVariable Integer id) {
        return dictOrderStatusService.getDictCarcass(id);
    }


    @GetMapping("")
    public List<DictOrderStatusDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return dictOrderStatusService.findDictCarcassAll();
    }

}
