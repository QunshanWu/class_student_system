package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface ClassMapper {
    @Insert("insert into db02.class_info(class_name, room_name, emp_id, start_time, end_time)values(#{className},#{roomName},#{emp.id},#{startTime},#{endTime})")
    void save(Clazz clazz);

    void delete(List<Integer> ids);

    List<Clazz> list();

    void update(Clazz clazz);

    List<Clazz> search(String className, LocalDate startTime, LocalDate endTime);
}
