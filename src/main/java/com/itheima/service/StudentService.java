package com.itheima.service;

import com.itheima.pojo.ClassDTO;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    void delete(List<Integer> ids);

    void update(Student student);

    PageBean page(Integer page, Integer pageSize, String name, Integer educationId, ClassDTO studentClass, String number);
}
