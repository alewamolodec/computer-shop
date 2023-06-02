package com.computershop.computershop.service;

import com.computershop.computershop.model.dto.MonitorDto;

import java.util.List;

public interface MonitorService {
    MonitorDto createMonitor(MonitorDto request);

    MonitorDto getMonitorById(Long id);

    Long updateMonitor(MonitorDto request);

    List<MonitorDto> findAllMonitors();
}
