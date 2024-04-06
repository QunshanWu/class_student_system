package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> getEmpListById(List<Integer> ids);
    @Select("select * from db02.emps_info where username = #{username} and password = #{password}")
    Emp getByUsernameAndPassword(Emp emp);
}
