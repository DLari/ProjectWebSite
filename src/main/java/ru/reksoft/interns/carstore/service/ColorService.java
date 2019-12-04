package ru.reksoft.interns.carstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.reksoft.interns.carstore.Mapper.ColorMapper;
import ru.reksoft.interns.carstore.dao.ColorRepository;
import ru.reksoft.interns.carstore.dto.ColorDTO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Autowired
    private ColorMapper colorMapper;


    public ColorDTO getColor(String name) {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return colorMapper.toDto(colorRepository.findByName(name));
    }

//    public Optional<ColorDTO> findColorOnId(Long id) {
////        if (color == null) {
////            throw new NotFoundException(id);
////        }
//        return colorMapper.toDtoOptional(colorRepository.findById(id));
//    }


    public List<ColorDTO> findColorAll() {
//        if (color == null) {
//            throw new NotFoundException(id);
//        }
        return colorRepository.findAll().stream().map(colorMapper::toDto).collect(Collectors.toList());
         //colorMapper.toDto(colorRepository.findAll());
    }

//    private final ColorRepository colorRepository;
//    private final ColorMapper colorMapper;
//
//    @Autowired
//    public ColorService(ColorRepository colorRepository, ColorMapper colorMapper) {
//        this.colorRepository = colorRepository;
//        this.colorMapper = colorMapper;
//    }

   // @Override
//    public ColorDTO save(ColorDTO dto) {
//        return colorMapper.toDto(colorRepository.save(colorMapper.toEntity(dto)));
//    }

   // @Override
 /*   public ColorDTO get(Long id) {
        return colorMapper.toDto(colorRepository.findById(id));
    }*/



//    public ColorDTO findAllColor() {
//         Iterable<Color> colorIterable  = colorRepository.findAll();
//        //   colorRepository.findOne(id);
//        return colorMapper.toDto(colorIterable);
//    }

//    public ColorDTO findColorOnId(Long id) {
//        Optional<Color> colorOptional = colorRepository.findById(id);
//             //   colorRepository.findOne(id);
//        return colorMapper.toDto(colorOptional);
//    }

   // Optional findById(ID primaryKey);




  /*  @Autowired
    ColorRepository colorRepository;

    @Transactional
    public void testCrudRepositoryy() {
        Optional<Color> colorOptional = colorRepository.findById(2L);
    }

    @Transactional
    public void testfindColorWithMoreThanPrice() {
        List<Color> colors = colorRepository.findColorWithMoreThanPrice(40_000L, Sort.by("name"));
    }*/



}
