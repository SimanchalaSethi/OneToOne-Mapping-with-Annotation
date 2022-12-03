package com.SS_GROUP.OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
      Session ss = new Configuration().configure().buildSessionFactory().openSession();
      
      //Person Object
      Person person = new Person();
      person.setId(12);
      person.setFirstName("abc");
      person.setLastName("xyz");
      
      //PanCard Object
      PanCard pancard = new PanCard();
      pancard.setId(122);
      pancard.setPerson(person);
      
      Transaction tr =ss.beginTransaction();
      ss.save(person);
      ss.save(pancard);
      tr.commit();
      ss.close();
    }
}
