package com.service;

import com.dao.ClienDao;
import com.dao.impl.ClientDaoImpl;
import com.entity.Client;

import java.util.List;

public class ClientService {
    private ClienDao dao = new ClientDaoImpl();
    public int addClient(Client client){
        return dao.addClient(client);
    }
    public int deleteClient(int clientId){
        return dao.deleteClient(clientId);
    }
    public int updateClient(Client client){
        return dao.updateClient(client);
    }
    public List<Client> findAllClient(){
        return dao.findAllClient();
    }

    public Client findByIdNumber(String IdNumber) {
        return dao.findByIdNumber(IdNumber);
    }
    public Client queryOne(String username){
        return dao.queryOne(username);
    }

    public Client findUserInfo() {
        return dao.findUserInfo();
    }
}
