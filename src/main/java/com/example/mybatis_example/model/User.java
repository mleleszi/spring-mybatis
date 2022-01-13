package com.example.mybatis_example.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {


    @NotNull
    @Min(1)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private Integer age;

    public User() {
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
