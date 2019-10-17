package com.example.springbooot1.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("stu")
@Data
@EqualsAndHashCode(callSuper = true)
public class Stu extends Model<Stu> {
    private static final long serialVersionUID = 1L;
    @TableId
    private int stuId;

    private String stuName;

    private int stuAge;

    private int stuCourse;
}
