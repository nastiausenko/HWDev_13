package org.example.services;

import org.example.crudService.PlanetDao;
import org.example.entity.Planet;

import java.util.List;

public class PlanetService {
    PlanetDao planetDao = new PlanetDao();

    public void save(Planet planet) {
       planetDao.save(planet);
    }

    public Planet findById(String id) {
        return planetDao.findById(id);
    }

    public void update(Planet planet) {
        planetDao.update(planet);
    }

    public void delete(Planet planet) {
        planetDao.delete(planet);
    }

    public List<Planet> getAllPlanets() {
        return  planetDao.getAllPlanets();
    }
}
