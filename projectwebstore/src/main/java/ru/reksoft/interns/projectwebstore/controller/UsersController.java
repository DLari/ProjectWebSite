package ru.reksoft.interns.projectwebstore.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.UsersDto;
import ru.reksoft.interns.projectwebstore.service.UsersService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UsersService usersService;

    @GetMapping("/{id}")
    public UsersDto getDictCarcass(@PathVariable Integer id) {
        return usersService.getUsers(id);
    }


    @GetMapping("")
    public List<UsersDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return usersService.findUsersAll();
    }

    @PostMapping("")
    public UsersDto create(@RequestBody @Valid UsersDto newUser) {
        return usersService.create(newUser);
    }

    @PutMapping(value = "/{id}")
    public Integer update(@PathVariable Integer id, @RequestBody UsersDto usersDto) {
        Integer updateId= usersService.update(id, usersDto);
        return updateId;
    }
}
