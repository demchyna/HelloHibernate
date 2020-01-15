package com.softserve.academy;

import com.softserve.academy.entities.Group;
import com.softserve.academy.entities.Student;
import com.softserve.academy.entities.StudentBook;
import com.softserve.academy.entities.Subject;
import com.softserve.academy.util.DatabaseUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Arrays;

public class App {

    public static void main( String[] args ) {

        final SessionFactory sessionFactory = DatabaseUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();

//        StudentBook stb1 = new StudentBook();
//        stb1.setSeries("SB");
//        stb1.setNumber("12345");
//
//        Group gr1 = new Group();
//        gr1.setTitle("PI-17-1");
//
//        Subject sub1 = new Subject();
//        sub1.setTitle("OOP");
//        sub1.setCredits(2.5);
//
//        Subject sub2 = new Subject();
//        sub2.setTitle("SOA");
//        sub2.setCredits(1.5);
//
//        Student st1 = new Student();
//        st1.setFirstName("Vasyl");
//        st1.setSecondName("Pupkin");
//        st1.setCourse(2);
//        st1.setStudentBook(stb1);
//        st1.setGroup(gr1);
//        st1.setSubjects(Arrays.asList(sub1, sub2));
//
        transaction.begin();
//
//        session.save(stb1);
//        session.save(gr1);
//        session.save(sub1);
//        session.save(sub2);
//        session.save(st1);

        Student student = session.get(Student.class, 7);

        System.out.println(student);


        transaction.commit();

        session.close();
        sessionFactory.close();





    }
}
