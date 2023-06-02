package com.computershop.computershop.service;

import com.computershop.computershop.mapper.LaptopMapper;
import com.computershop.computershop.model.dto.LaptopDto;
import com.computershop.computershop.model.entity.Laptop;
import com.computershop.computershop.repository.LaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopServiceImpl implements LaptopService{
    private final LaptopRepository repository;
    private final LaptopMapper mapper;

    @Override
    @Transactional
    public LaptopDto createLaptop(LaptopDto request) {
        return mapper.convertToDto(repository.save(mapper.convertToEntity(request)));
    }

    @Override
    @Transactional(readOnly = true)
    public LaptopDto getLaptopById(Long id) {
        return mapper.convertToDto(repository.findById(id).get());
    }

    @Override
    @Transactional
    public Long updateLaptop(LaptopDto request) {
        Laptop laptop = repository.save(mapper.convertToEntity(request));
        return laptop.getId();
    }

    @Override
    @Transactional(readOnly = true)
    public List<LaptopDto> findAllLaptops() {
        return mapper.convertToDto(repository.findAll());
    }
}
