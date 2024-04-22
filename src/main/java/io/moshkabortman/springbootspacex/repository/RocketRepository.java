package io.moshkabortman.springbootspacex.repository;

import io.moshkabortman.springbootspacex.entity.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketRepository extends JpaRepository<Rocket, Long> {
}
