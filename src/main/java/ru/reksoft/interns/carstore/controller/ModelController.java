package ru.reksoft.interns.carstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.carstore.dto.ModelDto;
import ru.reksoft.interns.carstore.entity.Model;
import ru.reksoft.interns.carstore.service.ModelService;

import javax.persistence.metamodel.SingularAttribute;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/models")
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


    @GetMapping("")
    public List<ModelDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return modelService.findModelAll();
    }

//    @RequestMapping(method = RequestMethod.GET, value = "search")
//    @ResponseBody
//    public List<ModelDto> search(@RequestParam(value = "name",required = false) String name, BigDecimal price) {
//       return modelService.search(name,price);
//    }


//    @RequestMapping(method = RequestMethod.GET, value = "search")
//    @ResponseBody
//    public List<ModelDto> search(@RequestParam(value = "name", required = false) String name) {
//        return modelService.search(name);
//    }

}
