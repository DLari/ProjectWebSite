package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.ColorDTO;
import ru.reksoft.interns.projectwebstore.service.ColorService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/colors")
public final class ColorController{

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ColorService colorService;

    @GetMapping("/{id}")
    @ResponseBody
    public ColorDTO getById(@PathVariable("id") Integer id){
        ColorDTO color = colorService.getById(id);
        return color;
    }

    @GetMapping("")
    @ResponseBody
    public List<ColorDTO> read(){
//        if(id==0)
//            throw new IdNotFoundException();
      return colorService.findColorAll();
    }

    @PostMapping("")
    public Integer create(@RequestBody ColorDTO newColor) {
       Integer id= colorService.create(newColor);
        return id;
    }

    @PutMapping(value = "/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody ColorDTO colorDto) {
        Integer updateId= colorService.update(id, colorDto);
        return updateId;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        colorService.delete(id);
    }
}