package io.moshkabortman.springbootspacex.mapper;

import io.moshkabortman.springbootspacex.dto.RocketDto;
import io.moshkabortman.springbootspacex.entity.Rocket;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ExtendWith(MockitoExtension.class)
class RocketMapperTest {


    private final RocketMapper rocketMapper = Mappers.getMapper(RocketMapper.class);

    @Test
    void toRocket() {
        RocketDto dto = new RocketDto("Space", 1000);

        Rocket result = rocketMapper.toRocket(dto);

        assertEquals("Space", result.getTitle());
        assertEquals(1000, result.getRange());
    }

    @Test
    void toRocketDto() {
    }
}