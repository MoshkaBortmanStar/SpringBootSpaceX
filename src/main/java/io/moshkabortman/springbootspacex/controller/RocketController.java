package io.moshkabortman.springbootspacex.controller;

import io.moshkabortman.springbootspacex.dto.RocketDto;
import io.moshkabortman.springbootspacex.service.RocketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rocket")
@RequiredArgsConstructor
public class RocketController {

    private final RocketService rocketService;

    @GetMapping
    public ResponseEntity<List<RocketDto>> getAll() {
        List<RocketDto> rockets = rocketService.getAll();
        return ResponseEntity.ok(rockets);
    }

    @PostMapping
    public ResponseEntity<RocketDto> saveRocket(@RequestBody RocketDto rocket) {
        RocketDto rocketDto = rocketService.createRocket(rocket);
        return new ResponseEntity<>(rocketDto, HttpStatus.OK);
    }

}
