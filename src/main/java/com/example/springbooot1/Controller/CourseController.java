package com.example.springbooot1.Controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbooot1.Entity.Course;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.Service.CourseService;
import com.example.springbooot1.Service.StuService;
import com.example.springbooot1.VO.StuVo;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/getCourseList")
    public List<Course> getCourseList(Course course){
        System.out.println("course  "+course);
        return  courseService.selectCourse(course);
    }
    @GetMapping("/page")
    public IPage<Course> getCoursePage(Page<Course> page,Course course){
        System.out.println("page  "+page);
        System.out.println("course  "+course);
       return courseService.page(page,Wrappers.query(course));
    }
}
