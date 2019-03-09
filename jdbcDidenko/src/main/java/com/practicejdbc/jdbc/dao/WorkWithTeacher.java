package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class WorkWithTeacher {

    @Autowired
    TeachersDAO teachersDAO;


    public Teacher addTeacher(Teacher teacher){
        teachersDAO.addTeacher(teacher);
        System.out.println("A Teacher has been added: "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teachersDAO.getTeacherById(id);
    }
    public void saveTacher(Teacher teacher){
        teachersDAO.saveTeacher(teacher);
        System.out.println("A Teacher has been saved: "+teacher);
    }

}
