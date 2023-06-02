package com.computershop.computershop.controller;

import com.computershop.computershop.model.dto.LaptopDto;
import com.computershop.computershop.service.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/laptop")
public class LaptopController {
    private final LaptopService service;

    @PostMapping(value = "/create")
    public LaptopDto createLaptop(@RequestBody LaptopDto request) {
        return service.createLaptop(request);
    }

    @GetMapping(value = "/get/{id}")
    public LaptopDto getLaptopById(@PathVariable("id") Long id) {
        return service.getLaptopById(id);
    }

    @PostMapping(value = "/update")
    public Long updateLaptop(@RequestBody LaptopDto request) {
        return service.updateLaptop(request);
    }

    @GetMapping(value = "/get")
    public List<LaptopDto> getAllLaptops() {
        return service.findAllLaptops();
    }
}
