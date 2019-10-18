package com.example.springbooot1.Controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.Service.StuService;
import com.example.springbooot1.VO.StuVo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/stu")
public class StuController {

    private final StuService stuService;

    @GetMapping("/page")
    public IPage<Stu> getStuPage(Page<Stu> page, Wrapper<Stu> queryWrapper){
        IPage<Stu> stuIPage = stuService.page(page, null);
        return stuIPage;
    }
    @GetMapping("/getStuList")
    public List<Stu> selectStuList(){
        return stuService.list();
    }

    @GetMapping("/getStuAndCourseList")
    public List<StuVo> getStuAndCourseList(){
        return stuService.listStuAndCourse();
    }
}
