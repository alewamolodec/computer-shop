package com.computershop.computershop.service;

import com.computershop.computershop.mapper.HardDriveMapper;
import com.computershop.computershop.model.dto.HardDriveDto;
import com.computershop.computershop.model.entity.HardDrive;
import com.computershop.computershop.repository.HardDriveRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HardDriveServiceImpl implements HardDriveService{
    private final HardDriveRepository repository;
    private final HardDriveMapper mapper;

    @Override
    @Transactional
    public HardDriveDto createHardDrive(HardDriveDto request) {
        return mapper.convertToDto(repository.save(mapper.convertToEntity(request)));
    }

    @Override
    @Transactional(readOnly = true)
    public HardDriveDto getHardDriveById(Long id) {
        return mapper.convertToDto(repository.findById(id).get());
    }

    @Override
    @Transactional
    public Long updateHardDrive(HardDriveDto request) {
        HardDrive hardDrive = repository.save(mapper.convertToEntity(request));
        return hardDrive.getId();
    }


    @Override
    @Transactional(readOnly = true)
    public List<HardDriveDto> findAllHardDrives() {
        return mapper.convertToDto(repository.findAll());
    }
}
