package com.itheima.service;

import com.itheima.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getEmpListById(List<Integer> ids);

    Emp login(Emp emp);
}
