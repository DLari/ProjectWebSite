package ru.reksoft.interns.projectwebstore.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.projectwebstore.dto.PageDto;
import ru.reksoft.interns.projectwebstore.entety.AutoInStock;
import ru.reksoft.interns.projectwebstore.mapper.AutoInStockMapper;
import ru.reksoft.interns.projectwebstore.search.SearchSpecifications;
import ru.reksoft.interns.projectwebstore.dao.AutoInStockRepository;
import ru.reksoft.interns.projectwebstore.dto.AutoInStockDto;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
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





    public PageDto<AutoInStockDto> findAutoAll(int pageSize,int pageNumber ) {
        Pageable pageable=PageRequest.of(pageNumber,pageSize);
        Page<AutoInStock> autoInStockPage=autoInStockRepository.findAll(pageable);
        List<AutoInStock> autoInStockList=autoInStockPage.getContent();
        List<AutoInStockDto> autoInStockDtoList=autoInStockList.stream().map(autoInStockMapper::toDto).collect(Collectors.toList());
        PageDto<AutoInStockDto> pageDto=new PageDto<>(autoInStockPage,autoInStockDtoList);
        return pageDto;
        //return autoInStockRepository.findAll().stream().map(autoInStockMapper::toDto).collect(Collectors.toList());
    }






    public PageDto<AutoInStockDto> search(Integer modelId, Integer colorId, Integer carcassId,
                                          Integer engineId, int pageSize,int pageNumber) {
        // .and(SearchSpecifications.modelPrice(modelPrice))

        Pageable pageable=PageRequest.of(pageNumber,pageSize);
         Page<AutoInStock> autoInStockPage= autoInStockRepository.findAll( SearchSpecifications.findModelId(modelId)
                .and(SearchSpecifications.findColorId(colorId))
                .and(SearchSpecifications.findCarcassId(carcassId))
                .and(SearchSpecifications.findEngineId(engineId))
                ,pageable);

         List<AutoInStock> autoInStockList= autoInStockPage.getContent();
       List<AutoInStockDto> autoInStockDtoList=  autoInStockList.stream().map(autoInStockMapper::toDto).collect(Collectors.toList());

//       List<AutoInStock> list = new ArrayList<>().stream().map(autoInStockMapper::toDto)
//               .collect(Collectors.toList());
        PageDto<AutoInStockDto> pageDto= new PageDto<>(autoInStockPage,autoInStockDtoList);
        return pageDto;
    }



    public AutoInStockDto create(AutoInStockDto newAuto) {
        autoInStockRepository.saveAndFlush(autoInStockMapper.toEntity(newAuto));
        return newAuto;
    }

    public Integer update(Integer id, AutoInStockDto autoInStockDto) {
        Integer reternId=id;
        AutoInStock autoInStock= autoInStockRepository.getById(id);
        autoInStockMapper.updateAuto(autoInStockDto,autoInStock);
        return reternId;
    }

    public void delete(Integer id) {
        AutoInStock autoInStock= autoInStockRepository.getById(id);
        autoInStock.setPresence(autoInStock.getPresence()-1);
        autoInStockRepository.saveAndFlush(autoInStock);
    }

}
