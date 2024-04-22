package io.moshkabortman.springbootspacex.repository;

import io.moshkabortman.springbootspacex.model.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketRepository extends JpaRepository<Rocket, Long> {


}
