package com.mintic.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Client;
import com.mintic.ciclo3.repository.crud.ClientCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {
  @Autowired
  private ClientCrudRepository clientCrudRepository;

  public List<Client> getAll() {
    return (List<Client>) clientCrudRepository.findAll();
  }

  public Optional<Client> getClient(int id) {
    return clientCrudRepository.findById(id);
  };

  public Client save(Client c) {
    return clientCrudRepository.save(c);
  }

  public Client edit(Client c) {
    return clientCrudRepository.save(c);
  }

  public void delete(int id) {
    clientCrudRepository.deleteById(id);
  }
}
