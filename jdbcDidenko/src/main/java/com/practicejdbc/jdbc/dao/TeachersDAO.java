package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Teacher;

public interface TeachersDAO {

    void addTeacher(Teacher teacher);
    Teacher getTeacherById(Integer id);
    void saveTeacher(Teacher teacher);


}
