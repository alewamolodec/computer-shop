package com.computershop.computershop.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "monitor")
public class Monitor {
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
    private Integer count;
    @Column(name = "diagonal")
    private Integer diagonal;
}
