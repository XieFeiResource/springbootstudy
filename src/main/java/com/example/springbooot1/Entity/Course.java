package com.example.springbooot1.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("course")
@Data
@EqualsAndHashCode(callSuper = true)
public class Course extends Model<Course> {
    private static final long serialVersionUID = 1L;
    @TableId
    private Integer cId;//此处int类型与integer类型区别很大，在接口中接收数据有区别

    private String cName;

    private Integer cGrade;

    private Integer stuId;
}
