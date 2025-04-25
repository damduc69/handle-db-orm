package com.codegym.dto;

public class CustomerNamesDto {
    private Integer id;
    private String name;

    public CustomerNamesDto() {
    }

    public CustomerNamesDto(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerNamesDto(String name) {
        this.name = name;
    }

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
