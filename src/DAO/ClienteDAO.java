/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.HibernateUtil;
import model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author Casa
 */
public class ClienteDAO {
    public int salvarClienteDAO(Cliente cliente) {
        
        Session session = null;
        Integer idClienteInserido = 0;
        
        // abre e fecha as sessões que serão utilizadas para criação
        // das transactions
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        
        try {
            session = sessionFactory.openSession();
            
            Transaction transaction = session.beginTransaction();
            
            idClienteInserido = (Integer)session.save(cliente);
            
            // salva os dados no banco
            transaction.commit();
            
        } catch(HibernateException e) {
           e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        
        return idClienteInserido;
    }
}
