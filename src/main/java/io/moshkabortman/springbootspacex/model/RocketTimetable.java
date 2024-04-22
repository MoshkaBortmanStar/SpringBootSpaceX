package io.moshkabortman.springbootspacex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class RocketTimetable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "rocket_id", referencedColumnName = "id")
    private Rocket rocket;
    private LocalDate startDate;
    private LocalDate endDate;

}
