package com.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.po.course;
@Repository("courseDao")
@Mapper
public interface CourseDao {
    public course selectCourseById(Integer courseId);
    public List<course> selectAllCourse();
    public int addCourse(course cou);
    public int updateCourse(course cou);
}
