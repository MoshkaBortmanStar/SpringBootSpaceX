package io.moshkabortman.springbootspacex.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Rocket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String name;
    private int range;

    @Builder.Default
    @OneToMany(mappedBy = "rocket",cascade = CascadeType.ALL)
    private final Set<RocketTimetable> timetables = new HashSet<>();

    public void addTimetable(RocketTimetable timetable) {
        this.timetables.add(timetable);
    }

}
