package org.example.services;

import org.example.crudService.TicketDao;
import org.example.entity.Ticket;

import java.util.List;

public class TicketService {
    TicketDao ticketDao = new TicketDao();
    public void save(Ticket ticket) {
       ticketDao.save(ticket);
    }

    public Ticket findById(Long id) {
        return ticketDao.findById(id);
    }

    public void update(Ticket ticket) {
        ticketDao.update(ticket);
    }

    public void delete(Ticket ticket) {
        ticketDao.delete(ticket);
    }

    public List<Ticket> getAllTickets() {
       return ticketDao.getAllTickets();
    }
}
