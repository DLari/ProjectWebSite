package ru.reksoft.interns.projectwebstore.Mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.UsersDto;
import ru.reksoft.interns.projectwebstore.entety.Users;

import java.util.Objects;

@Component
public class UsersMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Users toEntity(UsersDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, Users.class);
    }

    public UsersDto toDto(Users entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, UsersDto.class);
    }

}
