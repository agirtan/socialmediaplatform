package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "event_name")
    private String name;

}
