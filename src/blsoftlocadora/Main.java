/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blsoftlocadora;

import conexoes.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Casa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        String sql = "select version()";
        
        String resultado = (String)session.createNativeQuery(sql).getSingleResult();
        System.out.println(resultado);
        
        session.getTransaction().commit();
        
        session.close();
        
    }
    
}
