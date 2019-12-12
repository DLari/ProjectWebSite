package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.reksoft.interns.projectwebstore.dto.OrdersDto;
import ru.reksoft.interns.projectwebstore.service.OrdersService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/{id}")
    public OrdersDto getDictCarcass(@PathVariable Integer id) {
        return ordersService.getUser(id);
    }


    @GetMapping("")
    public List<OrdersDto> read(){
//        if(id==0)
//            throw new IdNotFoundException();
        return ordersService.findUsers();
    }
}
