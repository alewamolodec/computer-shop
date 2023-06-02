package com.computershop.computershop.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "hard_drive")
public class HardDrive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "series")
    private Long series;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private Double price;
    @Column(name = "count")
    private Long count;
    @Column(name = "size")
    private Integer size;
}
