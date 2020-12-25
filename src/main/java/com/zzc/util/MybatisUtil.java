package com.zzc.util;


import com.zzc.dao.EmpDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @Auther James_Gosling
 * @Date 2020/12/16
 */
public class MybatisUtil {
    //获取SqlSessionFactory
    public static SqlSessionFactory getSqlSessionFactory(){
        try {
            SqlSessionFactory  sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("SqlMapConfig.xml"));
            return sqlSessionFactory;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    //获取SqlSession
    public static SqlSession getSqlSession(){

        SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }

    public static void main(String[] args) {
        System.out.println(getSqlSession());
        EmpDao mapper = getSqlSession().getMapper(EmpDao.class);
        System.out.println(mapper.findAll());
    }
}

