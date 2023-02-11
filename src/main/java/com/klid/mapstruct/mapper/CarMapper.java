package com.klid.mapstruct.mapper;

import com.klid.mapstruct.dto.CarDto;
import com.klid.mapstruct.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto toDto(Car car);
}
