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
public class Admin {
    private Integer id;
    private String username;
    private Integer age;
}
