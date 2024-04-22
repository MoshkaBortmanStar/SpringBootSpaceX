package io.moshkabortman.springbootspacex.mapper;

import io.moshkabortman.springbootspacex.dto.RocketDto;
import io.moshkabortman.springbootspacex.entity.Rocket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RocketMapper {

    Rocket toRocket(RocketDto rocketDto);

    RocketDto toRocketDto(Rocket rocket);
}
