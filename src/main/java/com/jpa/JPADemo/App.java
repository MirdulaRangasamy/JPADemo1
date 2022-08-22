package com.jpa.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.JPADemo.inheritence.entity.ActiveEmployee;
import com.jpa.JPADemo.inheritence.entity.RetiredEmployee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {      
    	ActiveEmployee pardhi = new ActiveEmployee(101, "Pardhi", 50000, 2);
    	ActiveEmployee dhana = new ActiveEmployee(102,"Dhana",52000,3);
    	ActiveEmployee gokul = new ActiveEmployee(103,"Gokul",45000,1);
    	
    	RetiredEmployee empX = new RetiredEmployee(201, "MIRDU", 35000);
    	RetiredEmployee empY = new RetiredEmployee(202, "MIRDULA", 25000);
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("data_pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(pardhi);
        em.persist(dhana);
        em.persist(gokul);
        
        em.persist(empX);
        em.persist(empY);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}
