package com.it.service;

import com.it.pojo.Clazz;
import com.it.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface ClassService {
    void save(Clazz clazz);

    void delete(List<Integer> ids);

    List<Clazz> list();

    void update(Clazz clazz);

    PageBean page(Integer page, Integer pageSize, String className, LocalDate startTime, LocalDate endTime);

}
