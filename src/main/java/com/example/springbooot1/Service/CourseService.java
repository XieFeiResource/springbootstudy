package com.example.springbooot1.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbooot1.Entity.Course;

import java.util.List;

public interface CourseService extends IService<Course> {
    public List<Course> selectCourse(Course course);
}
