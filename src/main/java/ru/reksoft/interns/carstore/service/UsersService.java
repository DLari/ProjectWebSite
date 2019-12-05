package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.carstore.Mapper.UsersMapper;
import ru.reksoft.interns.carstore.dao.EngineRepository;
import ru.reksoft.interns.carstore.dao.UsersRepository;
import ru.reksoft.interns.carstore.dto.UsersDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private UsersMapper usersMapper;

    public UsersDto getUsers(Integer id) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return usersMapper.toDto(usersRepository.getById(id));
    }

    public List<UsersDto> findUsersAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return usersRepository.findAll().stream().map(usersMapper::toDto).collect(Collectors.toList());
    }
}
