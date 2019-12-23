package ru.reksoft.interns.projectwebstore.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.web.bind.annotation.*;
import ru.reksoft.interns.projectwebstore.dto.OrdersDto;
import ru.reksoft.interns.projectwebstore.service.OrdersService;

import javax.validation.Valid;
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

    @PostMapping("")
    public Integer create(@RequestBody @Valid OrdersDto newOrder) {
        Integer id= ordersService.create(newOrder);
        return id;
    }
//    @PutMapping(value = "/{id}")
//    public Integer update(@PathVariable Integer id, @RequestBody OrdersDto ordersDto) {
//        Integer updateId= ordersService.update(id, ordersDto);
//        return updateId;
//    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        ordersService.delete(id);
    }
}
