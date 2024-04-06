package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.ClassDTO;
import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Student;
import com.itheima.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public void save(Student student) {
        Integer id = student.getStudentClass().getId();
        student.setClassId(id);
        student.setUpdatetime(LocalDateTime.now());
        studentMapper.save(student);
    }

    @Override
    public void delete(List<Integer> ids) {
    studentMapper.delete(ids);
    }

    @Override
    public void update(Student student) {
        student.setUpdatetime(LocalDateTime.now());
        studentMapper.update(student);
    }

    @Override
    public PageBean page(Integer page, Integer pageSize, String name, Integer educationId, ClassDTO studentClass, String number) {
        PageHelper.startPage(page,pageSize);


        List<Student> studentList = studentMapper.search(name,educationId,studentClass,number);
        Page<Student> p = (Page<Student>) studentList;

        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }
}
