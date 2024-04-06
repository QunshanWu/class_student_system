package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String number;
    private Integer gender;
    private String phone;
    private Integer educationId;
    private Integer classId;
    private LocalDateTime updatetime;
    private ClassDTO studentClass;
}

