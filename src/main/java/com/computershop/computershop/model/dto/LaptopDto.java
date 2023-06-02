package com.computershop.computershop.model.dto;

import lombok.Data;

@Data
public class LaptopDto {
    private Long id;
    private Long series;
    private String manufacturer;
    private Double price;
    private Long count;
    private Integer size;
}
