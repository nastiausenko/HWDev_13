package org.example.services;

import org.example.crudService.PlanetCrudService;
import org.example.entity.Planet;

import java.util.List;

public class PlanetService {
    PlanetCrudService planetCrudService = new PlanetCrudService();

    public void save(Planet planet) {
       planetCrudService.save(planet);
    }

    public Planet findById(String id) {
        return planetCrudService.findById(id);
    }

    public void update(Planet planet) {
        planetCrudService.update(planet);
    }

    public void delete(Planet planet) {
        planetCrudService.delete(planet);
    }

    public List<Planet> getAllPlanets() {
        return  planetCrudService.getAllPlanets();
    }
}
