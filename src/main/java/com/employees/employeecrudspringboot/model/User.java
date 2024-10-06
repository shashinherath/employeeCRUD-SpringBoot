package com.employees.employeecrudspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String id;
    private String name;
}
