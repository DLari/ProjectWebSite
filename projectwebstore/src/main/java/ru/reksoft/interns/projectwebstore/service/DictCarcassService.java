package ru.reksoft.interns.projectwebstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.Mapper.DictCarcassMapper;
import ru.reksoft.interns.projectwebstore.dao.DictCarcassRepository;
import ru.reksoft.interns.projectwebstore.dto.DictCarcassDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DictCarcassService {

    @Autowired
    private DictCarcassRepository dictCarcassRepository;

    @Autowired
    private DictCarcassMapper dictCarcassMapper;

    public DictCarcassDto getDictCarcass(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return dictCarcassMapper.toDto(dictCarcassRepository.getById(id));
    }

    public List<DictCarcassDto> findDictCarcassAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return dictCarcassRepository.findAll().stream().map(dictCarcassMapper::toDto).collect(Collectors.toList());
    }
}
