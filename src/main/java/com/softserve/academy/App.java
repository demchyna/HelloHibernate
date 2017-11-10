package com.softserve.academy;

import com.softserve.academy.util.DatabaseUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

    public static void main( String[] args ) {

        final SessionFactory sessionFactory = DatabaseUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;





    }
}