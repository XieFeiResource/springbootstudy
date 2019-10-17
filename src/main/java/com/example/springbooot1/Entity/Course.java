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
    private int cId;

    private String Cname;

    private int cGrade;
}
