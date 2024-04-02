package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "planet")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Planet {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy = "toPlanetId", cascade = {PERSIST, MERGE, REMOVE, DETACH})
    private List<Ticket> ticketsToPlanet;

    @OneToMany(mappedBy = "fromPlanetId", cascade = {PERSIST, MERGE, REMOVE, DETACH})
    private List<Ticket> ticketsFromPlanet;


    @Override
    public String toString() {
        return "\nPlanet {" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               "}";
    }
}