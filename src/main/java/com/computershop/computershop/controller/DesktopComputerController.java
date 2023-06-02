package com.computershop.computershop.controller;

import com.computershop.computershop.model.dto.DesktopComputerDto;
import com.computershop.computershop.service.DesktopComputerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/desktop")
public class DesktopComputerController {
    private final DesktopComputerService service;

    @PostMapping(value = "/create")
    public DesktopComputerDto createDesktopComputer(@RequestBody DesktopComputerDto request) {
        return service.createDesktopComputer(request);
    }

    @GetMapping(value = "/get/{id}")
    public DesktopComputerDto getDesktopComputerById(@PathVariable("id") Long id) {
        return service.getDesktopComputerById(id);
    }

    @PostMapping(value = "/update")
    public Long updateDesktopComputer(@RequestBody DesktopComputerDto request) {
        return service.updateDesktopComputer(request);
    }

    @GetMapping(value = "/get")
    public List<DesktopComputerDto> getAllDesktopComputers() {
        return service.findAllDesktopComputers();
    }
}
