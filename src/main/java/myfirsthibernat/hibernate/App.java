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
     
    
     
     
     
     
     
     Session  session1  = factory.openSession();
     student1  stu  =  (student1)session1.load(student1.class,1);
     System.out.println(stu.getAge()+":"+stu.getPhone());
     System.out.println("hello  world");
     
              
     
     
    
    session1.close();
    factory.close();
    
    }
}
