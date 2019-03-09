package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Student;

public interface StudentsDAO {

    void adStudent(Student student);

    Student getStudentById(Integer id);
}
