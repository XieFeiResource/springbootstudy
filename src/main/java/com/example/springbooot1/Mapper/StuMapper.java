package com.example.springbooot1.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.VO.StuVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StuMapper extends BaseMapper<Stu> {
    public List<StuVo> listStuAndCourse(Page<StuVo> page,@Param("stuvo") StuVo stuvo);
}
