package com.computershop.computershop.service;

import com.computershop.computershop.mapper.MonitorMapper;
import com.computershop.computershop.model.dto.MonitorDto;
import com.computershop.computershop.model.entity.Monitor;
import com.computershop.computershop.repository.MonitorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MonitorServiceImpl implements MonitorService{
    private final MonitorRepository repository;
    private final MonitorMapper mapper;

    @Override
    @Transactional
    public MonitorDto createMonitor(MonitorDto request) {
        return mapper.convertToDto(repository.save(mapper.convertToEntity(request)));
    }

    @Override
    @Transactional(readOnly = true)
    public MonitorDto getMonitorById(Long id) {
        return mapper.convertToDto(repository.findById(id).get());
    }

    @Override
    @Transactional
    public Long updateMonitor(MonitorDto request) {
        Monitor monitor = repository.save(mapper.convertToEntity(request));
        return monitor.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<MonitorDto> findAllMonitors() {
        return mapper.convertToDto(repository.findAll());
    }
}
