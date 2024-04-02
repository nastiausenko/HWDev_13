package org.example.services;

import org.example.crudService.ClientDao;
import org.example.entity.Client;

import java.util.List;

public class ClientService {
    private ClientDao clientDao = new ClientDao();

    public void save(Client client) {
        clientDao.save(client);
    }

    public Client findById(Long id) {
       return clientDao.findById(id);
    }

    public void update(Client client) {
        clientDao.update(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }

    public List<Client> getAllClients() {
        return clientDao.getAllClients();
    }
}
