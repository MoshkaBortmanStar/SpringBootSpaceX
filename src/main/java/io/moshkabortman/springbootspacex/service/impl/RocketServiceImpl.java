package io.moshkabortman.springbootspacex.service.impl;

import io.moshkabortman.springbootspacex.model.Rocket;
import io.moshkabortman.springbootspacex.repository.RocketRepository;
import io.moshkabortman.springbootspacex.service.RocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RocketServiceImpl implements RocketService {

    private final RocketRepository rocketRepository;

    @Override
    public List<Rocket> getAll() {
        return rocketRepository.findAll();
    }

    @Override
    public void createRocket(Rocket rocket) {
        rocketRepository.save(rocket);
    }
}
