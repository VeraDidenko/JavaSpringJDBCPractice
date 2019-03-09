package com.practicejdbc.jdbc.dao;

import com.practicejdbc.jdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcStudentsDAO implements StudentsDAO {


    private static final String SQL_INSERT_STUDENT = "insert into students (pib,course) values (?,?)";

    private static final String SQL_SELECT_STUDENT_BY_ID = "select id, pib, course from students where id = ?";


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void adStudent(Student student) {

        jdbcTemplate.update(SQL_INSERT_STUDENT, student.getPib(), student.getCourse());
    }

    public Student getStudentById(Integer id) {

        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID, new RowMapper<Student>() {
            public Student mapRow(ResultSet resultSet, int i) throws SQLException {

                return new Student(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
            }
        }, id);
    }
}
