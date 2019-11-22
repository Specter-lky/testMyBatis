package com.po;

import java.util.List;

public class student {
    private Integer id;
    private String name;
    private Integer grade;
    private List<course> courses;

    public List<course> getCourses() {
        return courses;
    }

    public void setCourses(List<course> courses) {
        this.courses = courses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "student [id="+id+",name="+name+",grade="+grade+",courses="+courses+"]";
    }
}
