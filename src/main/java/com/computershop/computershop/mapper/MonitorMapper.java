package com.computershop.computershop.mapper;

import com.computershop.computershop.model.dto.MonitorDto;
import com.computershop.computershop.model.entity.Monitor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MonitorMapper {
    private final ModelMapper mapper;

    public MonitorMapper() {
        this.mapper = new ModelMapper();
    }

    public MonitorDto convertToDto(Monitor monitor) {
        return mapper.map(monitor, MonitorDto.class);
    }

    public Monitor convertToEntity(MonitorDto dto) {
        return mapper.map(dto, Monitor.class);
    }

    public List<MonitorDto> convertToDto(List<Monitor> list) {
        return mapper.map(list, new TypeToken<List<MonitorDto>>() {
        }.getType());
    }
}
