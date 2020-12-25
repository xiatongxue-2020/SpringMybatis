package com.zzc.dao.impl;

import com.zzc.dao.EmpDao;
import com.zzc.entity.Emp;
import com.zzc.util.MybatisUtil;
import jdk.nashorn.internal.ir.CallNode;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Auther James_Gosling
 * @Date 2020/12/16
 */
public class EmpDaoImpl implements EmpDao {
    /**
     * 做DML语句要手动提交事务
     * @return
     */
    public List<Emp> findAll() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Emp> emps = sqlSession.selectList("com.zzc.dao.EmpDao.findAll");
        return emps;
    }

    public Emp findById(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Emp emp = sqlSession.selectOne("com.zzc.dao.EmpDao.findById", id);

        return emp;
    }

    public Emp findByName(String name) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        Emp emp = sqlSession.selectOne("com.zzc.dao.EmpDao.findByName",name);
        return emp;
    }

    public void insert(Emp emp) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int insert = sqlSession.insert("com.zzc.dao.EmpDao.insert", emp);
        sqlSession.commit();
    }

    public void delete(Integer id) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int delete = sqlSession.delete("com.zzc.dao.EmpDao.delete", id);
        sqlSession.commit();
    }

    public int insertReturnId(Emp emp) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        int insert = sqlSession.insert("com.zzc.dao.EmpDao.insertReturnId", emp);
        sqlSession.commit();
        //返回新增主键
        return emp.getId();
    }

    public void update(Emp emp) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
         sqlSession.update("com.zzc.dao.EmpDao.update", emp);
        sqlSession.commit();
    }

}
