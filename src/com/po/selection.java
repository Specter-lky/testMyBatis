package com.po;

public class selection {
    private Integer studentId;
    private Integer courseId;
    private Integer time;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString(){
        return "selection [studentId="+studentId+",courseId="+courseId+",time="+time+"]";
    }
}
