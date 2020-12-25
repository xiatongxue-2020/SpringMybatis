package com.zzc.dao;

import com.zzc.entity.Emp;

import java.util.List;

public interface EmpDao {

    List<Emp> findAll();
    Emp findById(Integer id);
    Emp findByName(String name);
    void  insert(Emp emp);
    void delete(Integer id);
    int insertReturnId(Emp emp);
    void update(Emp emp);
}
