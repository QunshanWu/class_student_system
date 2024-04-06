package com.it.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.it.mapper.ClassMapper;
import com.it.pojo.Clazz;
import com.it.pojo.PageBean;
import com.it.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class ClassServiceImpl implements ClassService {
@Autowired
    private ClassMapper classMapper;
    @Override
    public void save(Clazz clazz) {
        classMapper.save(clazz);
    }

    @Override
    public void delete(List<Integer> ids) {
        classMapper.delete(ids);
    }

    @Override
    public List<Clazz> list() {
        return classMapper.list();
    }

    @Override
    public void update(Clazz clazz) {
        classMapper.update(clazz);
    }

    @Override
    public PageBean page(Integer page, Integer pageSize, String className, LocalDate startTime, LocalDate endTime) {
        PageHelper.startPage(page,pageSize);

        List<Clazz> empList = classMapper.search(className,startTime,endTime);
        Page<Clazz> p = (Page<Clazz>) empList;

        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }


}
