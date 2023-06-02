package com.computershop.computershop.service;

import com.computershop.computershop.model.dto.DesktopComputerDto;

import java.util.List;

public interface DesktopComputerService {
    DesktopComputerDto createDesktopComputer(DesktopComputerDto request);

    DesktopComputerDto getDesktopComputerById(Long id);

    Long updateDesktopComputer(DesktopComputerDto request);

    List<DesktopComputerDto> findAllDesktopComputers();
}
