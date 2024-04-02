package org.example.crudService;

import org.example.entity.Client;
import org.example.HibernateUtil;
import org.example.entity.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientCrudService {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    //create
    public void save(Client client) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(client);
            transaction.commit();
        }
    }

    //read
    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Client.class, id);
        }
    }

    // Update
    public void update(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(client);
            transaction.commit();
        }
    }

    // Delete
    public void delete(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.delete(client);
            transaction.commit();
        }
    }

    public List<Client> getAllClients(){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Client> clients = session.createQuery("from Client", Client.class).list();
        for (Client client : clients) {
            client.getTickets().size();
        }
        transaction.commit();
        session.close();
        return clients;
    }
}
