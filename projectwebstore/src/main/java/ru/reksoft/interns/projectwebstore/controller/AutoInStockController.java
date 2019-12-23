package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.AutoInStockDto;
import ru.reksoft.interns.projectwebstore.dto.PageDto;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock;
import ru.reksoft.interns.projectwebstore.service.AutoInStockService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class AutoInStockController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AutoInStockService autoInStockService;

    @GetMapping("/{id}")
    public AutoInStockDto getAuto(@PathVariable Integer id) {
        return autoInStockService.getAuto(id);
    }


    @GetMapping("")
    public PageDto<AutoInStockDto> read( @RequestParam (name = "size") Integer size,
                                      @RequestParam( name = "number") Integer number ){
//        if(id==0)
//            throw new IdNotFoundException();
        return autoInStockService.findAutoAll(size,number);
    }

    @RequestMapping(method = RequestMethod.GET, value = "search")
    @ResponseBody
    public PageDto<AutoInStockDto> searchCars(@RequestParam(name = "model", required = false) Integer modelId,
                                              @RequestParam (name = "color", required = false) Integer colorId,
                                              @RequestParam  (name = "carcass", required = false) Integer carcassId,
                                              @RequestParam  (name = "engine", required = false) Integer engineId,
                                              @RequestParam (name = "size") Integer size,
                                              @RequestParam( name = "number") Integer number) {
        return autoInStockService.search(modelId,colorId,carcassId,engineId,size,number);
    }

    @PostMapping("")
    public AutoInStockDto create(@RequestBody @Valid AutoInStockDto newAuto) {
       return autoInStockService.create(newAuto);
    }

    @PutMapping(value = "/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody AutoInStockDto autoInStockDto) {
        Integer updateId= autoInStockService.update(id, autoInStockDto);
        return updateId;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        autoInStockService.delete(id);
    }
}