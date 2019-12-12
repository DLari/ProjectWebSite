package ru.reksoft.interns.projectwebstore.Mapper;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.reksoft.interns.projectwebstore.dto.AutoInStockDto;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock;

import java.util.Objects;

@Component
public class AutoInStockMapper {

    @Autowired
    private ModelMapper modelMapper;

    public AutoInStock toEntity(AutoInStockDto dto) {
        return Objects.isNull(dto) ? null : modelMapper.map(dto, AutoInStock.class);
    }

    public AutoInStockDto toDto(AutoInStock entity) {
        return Objects.isNull(entity) ? null : modelMapper.map(entity, AutoInStockDto.class);
    }

}
