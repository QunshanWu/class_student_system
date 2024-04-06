package com.it.controller;

import com.it.pojo.ClassDTO;
import com.it.pojo.PageBean;
import com.it.pojo.Result;
import com.it.pojo.Student;
import com.it.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public Result save (@RequestBody Student student){
        studentService.save(student);
        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        studentService.delete(ids);
        return Result.success();
    }

    @PutMapping
    public Result update(@RequestBody Student student){
        studentService.update(student);
        return Result.success();
    }

    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name, Integer educationId, ClassDTO studentClass, String number){
        PageBean pageBean = studentService.page(page,pageSize,name,educationId,studentClass,number);
        return Result.success(pageBean);
    }

}
