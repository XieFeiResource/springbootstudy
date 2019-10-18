package com.example.springbooot1.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.VO.StuVo;

import javax.validation.constraints.Null;
import java.util.List;

public interface StuMapper extends BaseMapper<Stu> {
    public List<StuVo> listStuAndCourse();
}
