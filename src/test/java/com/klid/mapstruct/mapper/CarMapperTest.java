package com.klid.mapstruct.mapper;

import com.klid.mapstruct.model.Car;
import com.klid.mapstruct.model.CarType;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarMapperTest {

    private static final Logger logger = LoggerFactory.getLogger(CarMapperTest.class);

    private final CarMapper carMapper = CarMapper.INSTANCE;

    @Test
    void shouldConvertCarToCarDto() {
        var car = new Car("Ford", 5, CarType.SUV);

        var carDto = carMapper.toDto(car);

        logger.info("{}", carDto);

        assertThat(carDto.getName()).isEqualTo("Ford");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getType()).isEqualTo("SUV");
    }

}
