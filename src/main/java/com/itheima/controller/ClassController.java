package com.itheima.controller;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;
    @PostMapping
    public Result save (@RequestBody Clazz clazz){
        classService.save(clazz);
        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        classService.delete(ids);
        return Result.success();
    }

    @GetMapping("/list")
    public Result list(){
        List<Clazz> clazzList = classService.list();
        return Result.success(clazzList);
    }

    @GetMapping("/search")
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String className,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startTime,
                       @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endTime){
        PageBean pageBean = classService.page(page,pageSize,className,startTime, endTime);
        return Result.success(pageBean);
    }
    @PutMapping
    public Result update(@RequestBody Clazz clazz){
        classService.update(clazz);
        return Result.success();
    }

}
