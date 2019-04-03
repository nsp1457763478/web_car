package com.dao;

import com.entity.Client;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nsp
 * Date: 2019-03-26
 * Time: 14:37
 * Description: No Description
 */
public interface ClienDao {
    public Client queryOne(String username);
    public int addClient(Client client);
    public int deleteClient(int clientId);
    public int updateClient(Client client);
    public List<Client> findAllClient();
    public Client findByIdNumber(String IdNumber);

    public Client findUserInfo();
}
