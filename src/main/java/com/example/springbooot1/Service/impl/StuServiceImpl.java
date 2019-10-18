package com.example.springbooot1.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.Mapper.StuMapper;
import com.example.springbooot1.Service.StuService;
import com.example.springbooot1.VO.StuVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stuService")
public class StuServiceImpl extends ServiceImpl<StuMapper,Stu> implements StuService {

    @Override
    public List<StuVo> listStuAndCourse() {
        return baseMapper.listStuAndCourse();
    }
}
