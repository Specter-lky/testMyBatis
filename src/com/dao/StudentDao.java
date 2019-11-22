package com.dao;
import java.util.List;

import com.po.course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.student;
@Repository("studentDao")
@Mapper
public interface StudentDao {
    public student selectStudentById(Integer id);
    public List<student> selectAllStudent();
    public int addStudent(student stu);
    public int updateStudent(student stu);
    public List<student> selectAllstudentAndcourses();
}
