package io.moshkabortman.springbootspacex.service.impl;

import io.moshkabortman.springbootspacex.dto.RocketDto;
import io.moshkabortman.springbootspacex.entity.Rocket;
import io.moshkabortman.springbootspacex.mapper.RocketMapper;
import io.moshkabortman.springbootspacex.repository.RocketRepository;
import io.moshkabortman.springbootspacex.service.RocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RocketServiceImpl implements RocketService {

    private final RocketRepository rocketRepository;
    private final RocketMapper rocketMapper;

    @Override
    public List<RocketDto> getAll() {
        return rocketRepository.findAll()
                .stream()
                .map(rocketMapper::toRocketDto)
                .toList();
    }

    @Override
    public RocketDto createRocket(RocketDto dto) {
        Rocket rocket = rocketRepository.save(rocketMapper.toRocket(dto));

        return rocketMapper.toRocketDto(rocket);
    }
}
