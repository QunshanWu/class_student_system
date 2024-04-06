package com.it.service;

import com.it.pojo.ClassDTO;
import com.it.pojo.PageBean;
import com.it.pojo.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    void delete(List<Integer> ids);

    void update(Student student);

    PageBean page(Integer page, Integer pageSize, String name, Integer educationId, ClassDTO studentClass, String number);
}
