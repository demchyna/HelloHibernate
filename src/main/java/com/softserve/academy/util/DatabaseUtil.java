package com.softserve.academy.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseUtil {

    private static final Configuration cfg = new Configuration();

    public static SessionFactory getSessionFactory() {
        cfg.configure();

//        cfg.addAnnotatedClass(StudentBook.class);
//        cfg.addAnnotatedClass(Group.class);
//        cfg.addAnnotatedClass(Subject.class);
//        cfg.addAnnotatedClass(Student.class);

        return cfg.buildSessionFactory();
    }
}
