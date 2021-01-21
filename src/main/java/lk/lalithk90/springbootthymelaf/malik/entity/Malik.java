package lk.lalithk90.springbootthymelaf.malik.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Malik {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @Column(nullable = false, length = 50)
    private String name;
@Size(min = 9, max = 12, message = "Nic length should be 10 or 12")
    private String nic;
}

//1. entity
//2. database access (dao/repository)
//3.service
//4.controller
//5.html