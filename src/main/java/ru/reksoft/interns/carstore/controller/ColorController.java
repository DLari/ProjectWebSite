package ru.reksoft.interns.carstore.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.carstore.HttpExeption.IdNotFoundException;
//import ru.reksoft.interns.carstore.dao.ColorRepositoryImpl;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;
import ru.reksoft.interns.carstore.service.ColorService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/colors")
public final class ColorController{

    @Autowired
    private ModelMapper modelMapper;

   // ModelMapper modelMapper=new ModelMapper();

    @Autowired
    private  ColorDTO colorDTO;

    @Autowired
    private ColorService colorService;

    @GetMapping("/{id}")
    public ColorDTO getById(@PathVariable("id") Integer id){
        return colorService.getById(id);
    }

    @GetMapping("")
    public List<ColorDTO> read(){
//        if(id==0)
//            throw new IdNotFoundException();
      return colorService.findColorAll();
    }

//    @RequestMapping(method = RequestMethod.GET, value = "search")
//    @ResponseBody
//    public List<ColorDTO> search(@RequestParam(value = "name", required = false) String name) {
//        return colorService.search(name);
//    }



}