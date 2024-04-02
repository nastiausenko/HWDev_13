package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

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

    @Override
    public String toString() {
        return "\nPlanet {" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               "}";
    }
}