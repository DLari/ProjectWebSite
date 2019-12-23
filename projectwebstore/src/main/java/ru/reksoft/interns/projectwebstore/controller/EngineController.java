package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.EngineDto;
import ru.reksoft.interns.projectwebstore.service.EngineService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/engines")
public class EngineController {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private EngineService engineService;

    @GetMapping("/{id}")
    public EngineDto getDictCarcass(@PathVariable Integer id) {
        return engineService.getEngine(id);
    }


    @GetMapping("")
    public List<EngineDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return engineService.findEngineAll();
    }

    @PostMapping("")
    public EngineDto create(@RequestBody @Valid EngineDto newEngine) {
        return engineService.create(newEngine);
    }
    @PutMapping(value = "/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody EngineDto engineDto) {
        Integer updateId= engineService.update(id, engineDto);
        return updateId;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        engineService.delete(id);
    }
}