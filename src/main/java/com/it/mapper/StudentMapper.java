package com.it.mapper;

import com.it.pojo.ClassDTO;
import com.it.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Insert("insert into db02.student(name, number, gender, phone, education_id, class_id) values (#{name},#{number},#{gender},#{phone},#{educationId},#{classId})")
    void save(Student student);

    void delete(List<Integer> ids);

    void update(Student student);

    List<Student> search(String name, Integer educationId, ClassDTO studentClass, String number);
}
