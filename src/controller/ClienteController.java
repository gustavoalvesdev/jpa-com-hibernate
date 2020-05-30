/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
import DAO.ClienteDAO;

/**
 *
 * @author Casa
 */
public class ClienteController {
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    public int salvaClienteController(Cliente cliente) {
        return clienteDAO.salvarClienteDAO(cliente);
    }
        
}
