package com.it.controller;

import com.it.pojo.Emp;
import com.it.pojo.Result;
import com.it.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/job/{ids}")
    public Result getEmpListById(@PathVariable List<Integer> ids) {
        List<Emp> empList = empService.getEmpListById(ids);
        return Result.success(empList);
    }
    }




