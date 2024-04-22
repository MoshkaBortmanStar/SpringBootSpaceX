package io.moshkabortman.springbootspacex.service;

import io.moshkabortman.springbootspacex.dto.RocketDto;

import java.util.List;

public interface RocketService {

    List<RocketDto> getAll();

    RocketDto createRocket(RocketDto dto);
}
