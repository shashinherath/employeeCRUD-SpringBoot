package com.employees.employeecrudspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    private int id;
    private String name;
}
