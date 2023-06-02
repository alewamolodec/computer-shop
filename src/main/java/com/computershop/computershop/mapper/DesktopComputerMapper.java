package com.computershop.computershop.mapper;

import com.computershop.computershop.model.dto.DesktopComputerDto;
import com.computershop.computershop.model.entity.DesktopComputer;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DesktopComputerMapper {
    private final ModelMapper mapper;

    public DesktopComputerMapper() {
        this.mapper = new ModelMapper();
    }

    public DesktopComputerDto convertToDto(DesktopComputer desktopComputer) {
        return mapper.map(desktopComputer, DesktopComputerDto.class);
    }

    public DesktopComputer convertToEntity(DesktopComputerDto dto) {
        return mapper.map(dto, DesktopComputer.class);
    }

    public List<DesktopComputerDto> convertToDto(List<DesktopComputer> list) {
        return mapper.map(list, new TypeToken<List<DesktopComputerDto>>() {
        }.getType());
    }
}
