package io.moshkabortman.springbootspacex.repository;

import io.moshkabortman.springbootspacex.entity.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketTimeTableRepository extends JpaRepository<Rocket, Long> {

}
