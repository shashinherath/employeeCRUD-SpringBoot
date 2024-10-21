package com.employees.employeecrudspringboot.model;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "\"user\"")
public class User {
    @Id
    private int id;
    private String name;
}
