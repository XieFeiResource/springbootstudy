package com.example.springbooot1.Controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbooot1.Entity.Stu;
import com.example.springbooot1.Service.StuService;
import com.example.springbooot1.VO.StuVo;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api("StuController相关api")
@AllArgsConstructor
@RequestMapping("/stu")
public class StuController {

    private final StuService stuService;

    @ApiOperation("获取学生分页信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page",value = "分页对象"),
            @ApiImplicitParam(name = "queryWrapper", value = "查询条件对象")
    })
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping("/page")
    public IPage<Stu> getStuPage(Page<Stu> page, Wrapper<Stu> queryWrapper){
        IPage<Stu> stuIPage = stuService.page(page, null);
        return stuIPage;
    }
    @GetMapping("/getStuList")
    public List<Stu> selectStuList(){
        return stuService.list();
    }

    @ApiOperation("获取学生和课程的信息")
    @ApiResponses({
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @PostMapping("/getStuAndCourseList")
    public Page<StuVo> getStuAndCourseList(Page<StuVo> page,StuVo stuvo){
        return stuService.listStuAndCourse(page,stuvo);
    }
}
