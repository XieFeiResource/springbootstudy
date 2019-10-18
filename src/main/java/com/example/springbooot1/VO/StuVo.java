package com.example.springbooot1.VO;

import com.example.springbooot1.Entity.Course;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StuVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private int stuId;

    private String stuName;

    private int stuAge;

    private List<Course> courses;
}
