package com.computershop.computershop.controller;

import com.computershop.computershop.model.dto.MonitorDto;
import com.computershop.computershop.service.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/monitor")
public class MonitorController {
    private final MonitorService service;

    @PostMapping(value = "/create")
    public MonitorDto createMonitor(@RequestBody MonitorDto request) {
        return service.createMonitor(request);
    }

    @GetMapping(value = "/get/{id}")
    public MonitorDto getMonitorById(@PathVariable("id") Long id) {
        return service.getMonitorById(id);
    }

    @PostMapping(value = "/update")
    public Long updateMonitor(@RequestBody MonitorDto request) {
        return service.updateMonitor(request);
    }

    @GetMapping(value = "/get")
    public List<MonitorDto> getAllLaptops() {
        return service.findAllMonitors();
    }
}
