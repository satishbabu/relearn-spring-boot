package com.apnatriangle.relearnspringboot.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter @Setter @AllArgsConstructor @ToString
class User {
    private Integer id;
    private String name;
    private Date birthDate;
}
