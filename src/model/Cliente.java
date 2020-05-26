/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Casa
 */
@Entity(name = "Cliente")
@Table(name = "tbl_cliente")
public class Cliente {
    
    @Id
    @GeneratedValue
    @Column(name = "id_cliente")
    private int idCliente;
   
    private String nome;
    private String endereco;
    
    public Cliente() {
        super();
    }
    
    public Cliente(int idCliente, String nome, String endereco) {
        super();
        this.idCliente = idCliente;
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public int getIdCliente() {
        return idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    } 
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Id: " + idCliente +
                "\nNome: " + nome +
                "\nEndereço: " + endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.idCliente;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }
}
