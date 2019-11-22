package com.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.dao.*;
import com.po.*;
@Controller("userController")
public class UserController {
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private SelectionDao selectionDao;

    public void studentTest(){
        if(studentDao.selectStudentById(1)==null){
            System.out.println("无该学生！");
        }
        else {
            System.out.println(studentDao.selectStudentById(1));
        }
        System.out.println("=========================");
        student stu=new student();
        stu.setId(7);
        stu.setName("赵三");
        stu.setGrade(2017);
        int a=studentDao.addStudent(stu);
        System.out.println("添加了"+a+"条学生信息");
        student upstu=new student();
        upstu.setId(2);
        upstu.setName("李四");
        upstu.setGrade(2018);
        int up=studentDao.updateStudent(upstu);
        System.out.println("修改"+up+"条学生信息");
        System.out.println("所有学生信息：");
        List<student> list=studentDao.selectAllStudent();
        for(student s : list){
            System.out.println(s);
        }
    }
    public void courseTest(){
        if(courseDao.selectCourseById(3)==null){
            System.out.println("无该课程！");
        }
        else {
            System.out.println(courseDao.selectCourseById(3));
        }
        System.out.println("=========================");
        course addcou=new course();
        addcou.setId(7);
        addcou.setTitle("软件测试");
        addcou.setCredits(3);
        int a=courseDao.addCourse(addcou);
        System.out.println("添加了"+a+"条课程信息");
        System.out.println("=========================");
        course upcou=new course();
        upcou.setId(1);
        upcou.setTitle("马克思主义");
        upcou.setCredits(5);
        int up=courseDao.updateCourse(upcou);
        System.out.println("修改"+up+"条课程信息");
        System.out.println("=========================");
        System.out.println("所有课程信息：");
        List<course> list=courseDao.selectAllCourse();
        for(course c : list){
            System.out.println(c);
        }
    }
    public void selectionTest(){
        selection addselect=new selection();
        addselect.setStudentId(2);
        addselect.setCourseId(7);
        addselect.setTime(10);
        int a=selectionDao.addSelection(addselect);
        System.out.println("添加了"+a+"条选课信息");
        System.out.println("=========================");
        selection upselect=new selection();
        upselect.setStudentId(2);
        upselect.setCourseId(2);
        upselect.setTime(10);
        int up=selectionDao.updateSelection(upselect);
        System.out.println("修改"+up+"条选课信息");
        System.out.println("=========================");
        System.out.println("所有学生选课信息：");
        List<student> studentList=studentDao.selectAllstudentAndcourses();
        for(student students : studentList){
            System.out.println(students);
        }
    }
}
