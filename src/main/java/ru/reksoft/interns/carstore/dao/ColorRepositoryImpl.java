package ru.reksoft.interns.carstore.dao;

import org.springframework.data.domain.Sort;
import ru.reksoft.interns.carstore.dto.ColorDTO;
import ru.reksoft.interns.carstore.entity.Color;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ColorRepositoryImpl implements ColorRepository {
    private static List<ColorDTO> colors= new ArrayList<>();
    static {

        BigDecimal bd = new BigDecimal(40000);

        ColorDTO colorDTO=new ColorDTO();
        colorDTO.setId(1);
        colorDTO.setName("Green");
        colorDTO.setPrice(bd);
        colorDTO.setRemoved(false);

        colors.add(colorDTO);

        bd = new BigDecimal(24000);
        colorDTO= new ColorDTO();
        colorDTO.setId(2);
        colorDTO.setName("Yellow");
        colorDTO.setPrice(bd);
        colorDTO.setRemoved(false);

        colors.add(colorDTO);
    }

    @Override
    public Optional<Color> findByFirstName(String firtsName) {
        return Optional.empty();
    }

    @Override
    public List<Color> findColorWithMoreThanPrice(Long salary, Sort sort) {
        return null;
    }

    @Override
    public <S extends Color> S save(S s) {
        return null;
    }

    @Override
    public <S extends Color> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Color> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Color> findAll() {
        return null;
    }

    @Override
    public Iterable<Color> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Color color) {

    }

    @Override
    public void deleteAll(Iterable<? extends Color> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Color> getColorListWithMaxPrice() {
        return null;
    }
}
