package com.softserve.academy.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    private int id;
    private String firstName;
    private String secondName;
    private int course;
    private StudentBook studentBook;
    private Group group;
    private List<Subject> subjects;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "second_name", nullable = false, length = 45)
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "course", nullable = false)
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @OneToOne
    @JoinColumn(name = "studentbook_id")
    public StudentBook getStudentBook() {
        return studentBook;
    }

    public void setStudentBook(StudentBook studentBook) {
        this.studentBook = studentBook;
    }

    @ManyToOne
    @JoinColumn(name = "group_id")
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group groupId) {
        this.group = groupId;
    }

    @ManyToMany
    @JoinTable(name="student_subject",
            joinColumns = @JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name="subject_id"))
    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (course != student.course) return false;
        if (studentBook != student.studentBook) return false;
        if (group != student.group) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (secondName != null ? !secondName.equals(student.secondName) : student.secondName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + studentBook.hashCode();
        result = 31 * result + group.hashCode();
        return result;
    }
}
