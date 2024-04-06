package com.it.service.impl;

import com.it.mapper.EmpMapper;
import com.it.pojo.Emp;
import com.it.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> getEmpListById(List<Integer> ids) {
        return empMapper.getEmpListById(ids);
    }

    @Override
    public Emp login(Emp emp) {
        return empMapper.getByUsernameAndPassword(emp);
    }
}
