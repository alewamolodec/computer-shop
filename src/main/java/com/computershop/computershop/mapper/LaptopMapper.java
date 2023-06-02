package com.computershop.computershop.mapper;

import com.computershop.computershop.model.dto.LaptopDto;
import com.computershop.computershop.model.entity.Laptop;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LaptopMapper {
    private final ModelMapper mapper;

    public LaptopMapper() {
        this.mapper = new ModelMapper();
    }

    public LaptopDto convertToDto(Laptop laptop) {
        return mapper.map(laptop, LaptopDto.class);
    }

    public Laptop convertToEntity(LaptopDto dto) {
        return mapper.map(dto, Laptop.class);
    }

    public List<LaptopDto> convertToDto(List<Laptop> list) {
        return mapper.map(list, new TypeToken<List<LaptopDto>>() {
        }.getType());
    }
}
