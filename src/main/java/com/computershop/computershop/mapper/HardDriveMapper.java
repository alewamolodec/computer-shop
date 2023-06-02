package com.computershop.computershop.mapper;

import com.computershop.computershop.model.dto.HardDriveDto;
import com.computershop.computershop.model.entity.HardDrive;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HardDriveMapper {
    private final ModelMapper mapper;

    public HardDriveMapper() {
        this.mapper = new ModelMapper();
    }

    public HardDriveDto convertToDto(HardDrive hardDrive) {
        return mapper.map(hardDrive, HardDriveDto.class);
    }

    public HardDrive convertToEntity(HardDriveDto dto) {
        return mapper.map(dto, HardDrive.class);
    }

    public List<HardDriveDto> convertToDto(List<HardDrive> list) {
        return mapper.map(list, new TypeToken<List<HardDriveDto>>() {
        }.getType());
    }
}
