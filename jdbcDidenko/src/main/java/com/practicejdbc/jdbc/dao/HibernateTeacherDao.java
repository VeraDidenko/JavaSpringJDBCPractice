package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateTeacherDao  implements TeachersDAO{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    public void addTeacher(Teacher teacher) {
        getCurrentSession().save(teacher);
    }

    public Teacher getTeacherById(Integer id) {
        return getCurrentSession().get(Teacher.class, id);
    }

    public void saveTeacher(Teacher teacher) {
        getCurrentSession().update(teacher);
    }
}
