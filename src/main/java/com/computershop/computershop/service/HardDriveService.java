package com.computershop.computershop.service;

import com.computershop.computershop.model.dto.HardDriveDto;

import java.util.List;

public interface HardDriveService {
    HardDriveDto createHardDrive(HardDriveDto request);

    HardDriveDto getHardDriveById(Long id);

    Long updateHardDrive(HardDriveDto request);

    List<HardDriveDto> findAllHardDrives();
}
