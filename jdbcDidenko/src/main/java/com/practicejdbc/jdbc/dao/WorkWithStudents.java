package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithStudents {

    @Autowired
    private StudentsDAO studentsDAO;

    public void saveStudentToDb(Student student) {

        if (student != null && (student.getPib() != null) && (!"".equals(student.getPib())) && (student.getCourse() > 0)) {

            studentsDAO.adStudent(student);
            System.out.println("A Student has been saved: " + student);
            System.out.flush();
        }

    }

    public Student getStudentById(int id) {
        return studentsDAO.getStudentById(id);
    }

}
