package org.example.crudService;

import org.example.HibernateUtil;
import org.example.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;


public class TicketDao {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //create
    public void save(Ticket ticket) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(ticket);
            transaction.commit();
        }
    }

    //read
    public Ticket findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Ticket.class, id);
        }
    }

    // Update
    public void update(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(ticket);
            transaction.commit();
        }
    }

    // Delete
    public void delete(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(ticket);
            transaction.commit();
        }
    }

    public List<Ticket> getAllTickets(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Ticket> tickets = session.createQuery("from Ticket ", Ticket.class).list();
        for (Ticket ticket : tickets) {
            ticket.getClient().toString();
            ticket.getFromPlanetId().toString();
            ticket.getToPlanetId().toString();
        }
        transaction.commit();
        session.close();
        return tickets;
    }
}