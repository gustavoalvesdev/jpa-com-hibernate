/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blsoftlocadora;

/**
 *
 * @author Casa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        // TESTE DE INSERÇÃO DE CLIENTES
        
       /* System.out.println("Salvando o Cliente");
        
        ClienteController  clienteController = new ClienteController();
        
        Cliente cliente = new Cliente("Gustavo Alves da Silva", "Rua dos Goivos, 19");
        
        int idCliente = clienteController.salvaClienteController(cliente);
        
        System.out.println("ID do Cliente: " + idCliente); */
       
       new view.Cliente(null, true).setVisible(true);
    }
    
}
