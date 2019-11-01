package com.example.springbooot1.Service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbooot1.Entity.Course;
import com.example.springbooot1.Mapper.courseMapper;
import com.example.springbooot1.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service("courseService")
public class CourseServiceImpl extends ServiceImpl<courseMapper,Course> implements CourseService {
    @Override
    public List<Course> selectCourse(Course course) {
        List<Course> list=  baseMapper.selectList(Wrappers.<Course>lambdaQuery()
                .eq(Course::getCName,course.getCName()))
                .stream()
                .map(stuCourse -> {
                    stuCourse.setStuId(1);
                    return stuCourse;
                })
                .collect(Collectors.toList());
        return list;
    }
}
