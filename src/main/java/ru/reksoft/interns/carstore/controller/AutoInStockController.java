package ru.reksoft.interns.carstore.controller;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.carstore.dto.AutoInStockDto;
import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.service.AutoInStockService;

import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoInStockController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AutoInStockDto autoInStockDto;

    @Autowired
    private AutoInStockService autoInStockService;

    @GetMapping("/{id}")
    public AutoInStockDto getDictCarcass(@PathVariable Integer id) {
        return autoInStockService.getAuto(id);
    }


    @GetMapping("/all")
    public List<AutoInStockDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return autoInStockService.findAutoAll();
    }

}
