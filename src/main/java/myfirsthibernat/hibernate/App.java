package myfirsthibernat.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
        Configuration cfg  =  new  Configuration();
         cfg.configure("hibernate.cfg.xml"); 
     SessionFactory  factory  =  cfg.buildSessionFactory();
     System.out.println(factory);
     System.out.println( "goo  working  with hibrnae '");
     student  st =  new  student();
     
     st.setName("devid  ");
     
     st.setSirname("varner");
     st.setCity("new  delhi");
     
     
     
     
     
     Session  session1  = factory.getCurrentSession();
     
     Transaction  t  =  session1.beginTransaction();
     session1.save(st);
    t.commit();
    session1.close();
    
    }
}
