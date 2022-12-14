package com.org.demo.HibDemo2;
import java.util.ArrayList;    

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
//import org.hibernate.boot.Metadata;  
//import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;  
public class App 
{
	static Session sessionObj;
    static SessionFactory sessionFactoryObj;
 
    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");
 
        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
 
        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }
       
    public static void main( String[] args ) throws HibernateException
    {
        System.out.println( "Hello World! HibDemo2" );
        System.out.println(".......Hibernate One To Many Mapping Example.......\n");
        try {
            sessionObj = buildSessionFactory().openSession();
            sessionObj.beginTransaction();
 
            Student studentObj = new Student("Java", "Geek",  "java@gmail.com", "0123456789");
            sessionObj.save(studentObj);
 
            MarksDetails marksObj1 = new MarksDetails("English", "100", "90",  "Pass");  
            marksObj1.setStudent(studentObj);  
            sessionObj.save(marksObj1);
 
            MarksDetails marksObj2 = new MarksDetails("Maths", "100", "99",  "Pass");  
            marksObj2.setStudent(studentObj);
            sessionObj.save(marksObj2);
 
            MarksDetails marksObj3 = new MarksDetails("Science", "100", "94",  "Pass");  
            marksObj3.setStudent(studentObj);
            sessionObj.save(marksObj3);
 
            // Committing The Transactions To The Database
            sessionObj.getTransaction().commit();
 
            System.out.println("\n.......Records Saved Successfully To The Database.......");
        } catch(Exception sqlException) {
          /*  if(null != sessionObj.getTransaction()) {
                System.out.println("\n.......Transaction Is Being Rolled Back.......");
                sessionObj.getTransaction().rollback();
            }*/
            sqlException.printStackTrace();
        	
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }
    }
        

      
     
    }

