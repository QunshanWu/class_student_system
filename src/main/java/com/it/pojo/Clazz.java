package com.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {
    private Integer id;
    private String className;
    private String roomName;
    private LocalDate startTime;
    private LocalDate endTime;
    private Emp emp;

}
