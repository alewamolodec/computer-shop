package com.computershop.computershop.service;

import com.computershop.computershop.mapper.DesktopComputerMapper;
import com.computershop.computershop.model.dto.DesktopComputerDto;
import com.computershop.computershop.model.entity.DesktopComputer;
import com.computershop.computershop.repository.DesktopComputerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesktopComputerServiceImpl implements DesktopComputerService {
    private final DesktopComputerRepository repository;
    private final DesktopComputerMapper mapper;

    @Override
    @Transactional
    public DesktopComputerDto createDesktopComputer(DesktopComputerDto request) {
        return mapper.convertToDto(repository.save(mapper.convertToEntity(request)));
    }

    @Override
    @Transactional(readOnly = true)
    public DesktopComputerDto getDesktopComputerById(Long id) {
        return mapper.convertToDto(repository.findById(id).get());
    }

    @Override
    @Transactional
    public Long updateDesktopComputer(DesktopComputerDto request) {
        DesktopComputer computer = repository.save(mapper.convertToEntity(request));
        return computer.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<DesktopComputerDto> findAllDesktopComputers() {
        return mapper.convertToDto(repository.findAll());
    }
}
