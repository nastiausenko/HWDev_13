package org.example.services;

import org.example.crudService.TicketCrudService;
import org.example.entity.Ticket;

import java.util.List;

public class TicketService {
    TicketCrudService ticketCrudService = new TicketCrudService();
    public void save(Ticket ticket) {
       ticketCrudService.save(ticket);
    }

    public Ticket findById(Long id) {
        return ticketCrudService.findById(id);
    }

    public void update(Ticket ticket) {
        ticketCrudService.update(ticket);
    }

    public void delete(Ticket ticket) {
        ticketCrudService.delete(ticket);
    }

    public List<Ticket> getAllTickets() {
       return ticketCrudService.getAllTickets();
    }
}
