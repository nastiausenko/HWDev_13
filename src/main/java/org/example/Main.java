package org.example;

import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.services.ClientService;
import org.example.services.PlanetService;
import org.example.services.TicketService;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();
        TicketService ticketService = new TicketService();

        //create new client
        Client newClient = new Client();
        newClient.setName("Jack");
        clientService.save(newClient);
        System.out.println("Client id = 11, name = " + clientService.findById(11L).getName());

        //update client
        System.out.println("Client id = 2, name = " + clientService.findById(2L).getName());
        Client client = clientService.findById(2L);
        client.setName("Andrew");
        clientService.update(client);
        System.out.println("Updated client id = 2, name = " + clientService.findById(2L).getName());

        //create new planet
        Planet newPlanet = new Planet();
        newPlanet.setId("MERC");
        newPlanet.setName("Mercury");
        planetService.save(newPlanet);
        System.out.println("New planet: " + planetService.findById("MERC"));

        //update planet
        Planet planet = planetService.findById("MERC");
        planet.setName("Mercury02");
        planetService.update(planet);
        System.out.println("Updated planet: " + planetService.findById("MERC"));

        //create new ticket
        Ticket newTicket = new Ticket();
        newTicket.setClient(clientService.findById(1L));
        newTicket.setFromPlanetId(planetService.findById("MERC"));
        newTicket.setToPlanetId(planetService.findById("EAR"));
        ticketService.save(newTicket);

        //update ticket
        Ticket ticket = ticketService.findById(3L);
        System.out.println(ticket + "\n");
        ticket.setToPlanetId(planetService.findById("MERC"));
        ticketService.update(ticket);
        System.out.println("Updated ticket:" + ticket);

        System.out.println(clientService.getAllClients());
        System.out.println(planetService.getAllPlanets());
        System.out.println(ticketService.getAllTickets());

        HibernateUtil.getInstance().close();
    }
}
