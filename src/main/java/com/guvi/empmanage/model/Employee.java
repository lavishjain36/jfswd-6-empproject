package com.guvi.empmanage.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name")
    private  String firstName;
    @Column(name="last_name")
    private  String lastName;
    @Column(name = "email")
    private  String email;

}
