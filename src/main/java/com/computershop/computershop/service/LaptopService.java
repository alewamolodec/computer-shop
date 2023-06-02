package com.computershop.computershop.service;

import com.computershop.computershop.model.dto.LaptopDto;

import java.util.List;

public interface LaptopService {
    LaptopDto createLaptop(LaptopDto request);

    LaptopDto getLaptopById(Long id);

    Long updateLaptop(LaptopDto request);

    List<LaptopDto> findAllLaptops();
}
