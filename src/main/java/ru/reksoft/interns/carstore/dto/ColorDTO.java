package ru.reksoft.interns.carstore.dto;

import lombok.*;

import java.math.BigDecimal;
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class ColorDTO {

    @Setter
    @Getter
    private Integer id;

    @Setter
    @Getter
    private String name;

    @Setter
    @Getter
    private BigDecimal price;

//    @Setter
//    @Getter
    private Boolean removed;




}
