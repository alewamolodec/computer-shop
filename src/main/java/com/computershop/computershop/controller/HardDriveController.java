package com.computershop.computershop.controller;

import com.computershop.computershop.model.dto.HardDriveDto;
import com.computershop.computershop.service.HardDriveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hard")
public class HardDriveController {
    private final HardDriveService service;
    @PostMapping(value = "/create")
    public HardDriveDto createHardDrive(@RequestBody HardDriveDto request) {
        return service.createHardDrive(request);
    }

    @GetMapping(value = "/get/{id}")
    public HardDriveDto getHardDriveById(@PathVariable("id") Long id) {
        return service.getHardDriveById(id);
    }

    @PostMapping(value = "/update")
    public Long updateHardDrive(@RequestBody HardDriveDto request) {
        return service.updateHardDrive(request);
    }

    @GetMapping(value = "/get")
    public List<HardDriveDto> getAllHardDrives() {
        return service.findAllHardDrives();
    }
}
