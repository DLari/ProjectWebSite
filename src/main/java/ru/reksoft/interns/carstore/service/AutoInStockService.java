package ru.reksoft.interns.carstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.carstore.Mapper.AutoInStockMapper;
import ru.reksoft.interns.carstore.dao.AutoInStockRepository;
import ru.reksoft.interns.carstore.dto.AutoInStockDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutoInStockService {

    @Autowired
    private AutoInStockRepository autoInStockRepository;

    @Autowired
    private AutoInStockMapper autoInStockMapper;

    public AutoInStockDto getAuto(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return autoInStockMapper.toDto(autoInStockRepository.getById(id));
    }

    public List<AutoInStockDto> findAutoAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return autoInStockRepository.findAll().stream().map(autoInStockMapper::toDto).collect(Collectors.toList());
    }
    }
