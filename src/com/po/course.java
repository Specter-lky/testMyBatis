package com.po;

import java.util.List;

public class course {
    private Integer id;
    private String title;
    private Integer credits;
    private List<student> students;

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Override
    public String toString(){
        return "course [id="+id+",title="+title+",credits="+credits+"]";
    }
}
