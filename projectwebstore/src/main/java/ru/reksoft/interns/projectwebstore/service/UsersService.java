package ru.reksoft.interns.projectwebstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.mapper.UsersMapper;
import ru.reksoft.interns.projectwebstore.dao.UsersRepository;
import ru.reksoft.interns.projectwebstore.dto.UsersDto;
import ru.reksoft.interns.projectwebstore.entety.Users;

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
    public UsersDto create(UsersDto newUser) { Integer id=newUser.getId();
        usersRepository.saveAndFlush(usersMapper.toEntity(newUser));
        return newUser;
    }

    public Integer update(Integer id, UsersDto usersDto) {
        Integer reternId=id;
        Users users= usersRepository.getById(id);
        usersMapper.updateUser(usersDto,users);
        return reternId;
    }
}
