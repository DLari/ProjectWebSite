package ru.reksoft.interns.carstore.controller;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.carstore.dto.AutoInStockDto;
import ru.reksoft.interns.carstore.entity.AutoInStock;
import ru.reksoft.interns.carstore.service.AutoInStockService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class AutoInStockController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AutoInStockDto autoInStockDto;

    @Autowired
    private AutoInStockService autoInStockService;

    @GetMapping("/{id}")
    public AutoInStockDto getAuto(@PathVariable Integer id) {
        return autoInStockService.getAuto(id);
    }


    @GetMapping("")
    public List<AutoInStockDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return autoInStockService.findAutoAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "search")
    @ResponseBody
    public List<AutoInStockDto> searchCars(@RequestParam(required = false) Integer modelId,
                                           @RequestParam (required = false)Integer colorId,
                                           @RequestParam  (required = false)Integer carcassId,
                                           @RequestParam  (required = false)Integer engineId
                                           //     @RequestParam (required = false)BigDecimal modelPrice,
    ) {
        return autoInStockService.search(modelId,colorId,carcassId,engineId);
    }

}
