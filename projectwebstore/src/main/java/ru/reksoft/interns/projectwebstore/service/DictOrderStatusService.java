package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.mapper.DictOrderStatusMapper;
import ru.reksoft.interns.projectwebstore.dao.DictOrderStatusRepository;
import ru.reksoft.interns.projectwebstore.dto.DictOrderStatusDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DictOrderStatusService {

    @Autowired
    private DictOrderStatusRepository dictOrderStatusRepository;

    @Autowired
    private DictOrderStatusMapper dictOrderStatusMapper;

    public DictOrderStatusDto getDictCarcass(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return dictOrderStatusMapper.toDto(dictOrderStatusRepository.getById(id));
    }

    public List<DictOrderStatusDto> findDictCarcassAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return dictOrderStatusRepository.findAll().stream().map(dictOrderStatusMapper::toDto).collect(Collectors.toList());
    }

}
