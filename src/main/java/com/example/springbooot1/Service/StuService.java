package com.example.springbooot1.Service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.VO.StuVo;

import java.util.List;

public interface StuService extends IService<Stu> {
    public Page<StuVo> listStuAndCourse(Page<StuVo> page);
}
