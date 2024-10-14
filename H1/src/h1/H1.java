/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;

import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author salam
 */
public class H1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        // TODO code application logic here
    }
    
}
