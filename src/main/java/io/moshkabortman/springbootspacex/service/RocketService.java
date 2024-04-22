package io.moshkabortman.springbootspacex.service;

import io.moshkabortman.springbootspacex.model.Rocket;

import java.util.List;

public interface RocketService {

    List<Rocket> getAll();

    void createRocket(Rocket rocket);


}
