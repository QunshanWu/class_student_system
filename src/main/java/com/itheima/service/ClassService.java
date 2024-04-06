package com.itheima.service;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.PageBean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ClassService {
    void save(Clazz clazz);

    void delete(List<Integer> ids);

    List<Clazz> list();

    void update(Clazz clazz);

    PageBean page(Integer page, Integer pageSize, String className, LocalDate startTime, LocalDate endTime);

}
