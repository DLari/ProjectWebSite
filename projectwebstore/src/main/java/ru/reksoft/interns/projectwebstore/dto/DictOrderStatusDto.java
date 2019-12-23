package ru.reksoft.interns.projectwebstore.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DictOrderStatusDto {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}