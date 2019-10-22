package com.sda.project.wypozyczalnia.model;

import com.sda.project.wypozyczalnia.extras.Accessibility;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    @Enumerated(EnumType.STRING)
    private Accessibility accessibility;

    private String Organizer;
    private LocalDateTime date;

    @ManyToMany
    @JoinTable(
            name = "participant_events",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private List<User> participants;
}
