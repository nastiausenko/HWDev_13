package org.example.services;

import org.example.crudService.ClientCrudService;
import org.example.entity.Client;

import java.util.List;

public class ClientService {
    private ClientCrudService clientCrudService = new ClientCrudService();

    public void save(Client client) {
        clientCrudService.save(client);
    }

    public Client findById(Long id) {
       return clientCrudService.findById(id);
    }

    public void update(Client client) {
        clientCrudService.update(client);
    }

    public void delete(Client client) {
        clientCrudService.delete(client);
    }

    public List<Client> getAllClients() {
        return clientCrudService.getAllClients();
    }
}
