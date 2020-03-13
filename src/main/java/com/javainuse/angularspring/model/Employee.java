package com.javainuse.angularspring.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {
    private String empId;
    private String name;
    private String designation;
    private double salary;
}
