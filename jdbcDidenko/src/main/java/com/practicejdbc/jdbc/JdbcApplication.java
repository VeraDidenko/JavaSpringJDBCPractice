package com.practicejdbc.jdbc;

import com.practicejdbc.jdbc.dao.WorkWithStudents;
import com.practicejdbc.jdbc.dao.WorkWithTeacher;
import com.practicejdbc.jdbc.model.Student;
import com.practicejdbc.jdbc.model.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class JdbcApplication {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        WorkWithStudents workWithStudents = context.getBean("worker", WorkWithStudents.class);

        Student student = new Student("Amanda Ann", 3);

        workWithStudents.saveStudentToDb(student);
        System.out.println(workWithStudents.getStudentById(1));

        WorkWithTeacher workWithTeacher = context.getBean("teachersWorker", WorkWithTeacher.class);

        Teacher teacher = new Teacher();
        teacher.setFirstName("Dan");
        teacher.setLastName("Shawn");
        teacher.setCellPhone("0986555432");
        workWithTeacher.addTeacher(teacher);
        System.out.println(workWithTeacher.getTeacherById(1));
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTacher(teacher);
        System.out.println(workWithTeacher.getTeacherById(1));


        context.close();


    }

}
