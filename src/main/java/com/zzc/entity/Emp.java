package com.zzc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther James_Gosling
 * @Date 2020/12/16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Emp {
    private Integer id;
    private String name;
    private String job;
    private Double sal;
    private Integer deptno;
}
