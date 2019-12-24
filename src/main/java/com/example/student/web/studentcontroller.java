package com.example.student.web;



import com.example.student.bean.Student;
import com.example.student.util.Message;
import com.example.student.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")
public class studentcontroller {

    @PostMapping("/add")
    @ApiOperation(value = "添加学生")

    public Message add(Student student){



        return MessageUtil.success("添加学生成功");
    }





    @GetMapping("/delete")
    @ApiOperation(value = "删除学生")     //方法说明
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name",value = "学生姓名",paramType = "query",dataType = "string",required = true),
            @ApiImplicitParam(name = "ID",value = "学生学号",paramType = "query",dataType = "int")
    })    //参数说明
    public Message delete(int ID,String name){

        Message<String> message=new Message<>();
        return message;

    }

}
