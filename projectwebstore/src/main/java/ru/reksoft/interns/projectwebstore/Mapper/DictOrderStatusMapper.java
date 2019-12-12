package ru.reksoft.interns.projectwebstore.Mapper;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.DictOrderStatusDto;
import ru.reksoft.interns.projectwebstore.entety.DictOrderStatus;

import java.util.Objects;

@Component
public class DictOrderStatusMapper {

    @Autowired
    private ModelMapper modelMapper;

    // @Override
    public DictOrderStatus toEntity(DictOrderStatusDto dto) {
        return
                //Objects.isNull(dto) ? null :
                modelMapper.map(dto, DictOrderStatus.class);
    }

    public DictOrderStatusDto toDto(DictOrderStatus entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, DictOrderStatusDto.class);
    }
}
