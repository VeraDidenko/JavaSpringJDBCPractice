package com.practicejdbc.jdbc.model;

public class Student {

    private Integer studentId;
    private String pib;
    private Integer course;

    public Student(Integer studentId, String pib, Integer course) {
        this(pib, course);
        this.studentId = studentId;
    }

    public Student(String pib, Integer course) {
        this.pib = pib;
        this.course = course;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", pib='" + pib + '\'' +
                ", course=" + course +
                '}';
    }
}
