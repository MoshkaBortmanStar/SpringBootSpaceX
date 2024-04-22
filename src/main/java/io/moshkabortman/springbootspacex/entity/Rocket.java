package io.moshkabortman.springbootspacex.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
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
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Rocket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int range;

    @Builder.Default
    @OneToMany(mappedBy = "rocket", cascade = CascadeType.ALL)
    private Set<RocketTimetable> timetableSet = new HashSet<>();

    public void addTimetable(RocketTimetable rocketTimetable) {
        timetableSet.add(rocketTimetable);
        rocketTimetable.setRocket(this);
    }

    public void removeTimetable(RocketTimetable rocketTimetable) {
        timetableSet.remove(rocketTimetable);
        rocketTimetable.setRocket(null);
    }

}
