package org.example.crudService;

import org.example.HibernateUtil;
import org.example.entity.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetDao {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //create
    public void save(Planet planet) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(planet);
            transaction.commit();
        }
    }

    //read
    public Planet findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Planet.class, id);
        }
    }

    // Update
    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(planet);
            transaction.commit();
        }
    }

    // Delete
    public void delete(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(planet);
            transaction.commit();
        }
    }

    public List<Planet> getAllPlanets(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Planet> planets = session.createQuery("from Planet", Planet.class).list();
        for (Planet planet : planets) {
            planet.getTicketsToPlanet().size();
            planet.getTicketsFromPlanet().size();
        }
        transaction.commit();
        session.close();
        return planets;
    }
}
