package ru.reksoft.interns.carstore.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.carstore.HttpExeption.IdNotFoundException;
//import ru.reksoft.interns.carstore.dao.ColorRepositoryImpl;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;
import ru.reksoft.interns.carstore.service.ColorService;

import java.util.Optional;

@RestController
@RequestMapping("/color")
public final class ColorController{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private  ColorDTO colorDTO;

    @Autowired
    private ColorService colorService;

    @GetMapping("/{id}")
    public ColorDTO read(@PathVariable long id){
        if(id==0)
            throw new IdNotFoundException();
      return colorService.get(id);
    }



      /*  @GetMapping("/{id}")
    public ColorDTO read(@PathVariable long id){
        if(id==0)
            throw new IdNotFoundException();
        Optional<Color> color= colorDaoimpl.findById(id);
        return color;
    }*/
 /*   @RequestMapping(value = "/create",
            method = RequestMethod.POST)
    @ResponseBody
    public Color addColor(@RequestBody Color color) {

      //  System.out.println("(Service Side) Creating color: " + colorService.getByFirst());
        return colorService.save(color);
    }*/


}