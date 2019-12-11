package ru.reksoft.interns.carstore.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.carstore.dto.UsersDto;
import ru.reksoft.interns.carstore.service.UsersService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UsersDto usersDto;

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
}
