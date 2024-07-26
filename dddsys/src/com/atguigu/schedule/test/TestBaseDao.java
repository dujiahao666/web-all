package com.atguigu.schedule.test;



import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.util.BaseDao;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestBaseDao {
    private static BaseDao baseDao;

    @BeforeClass
    public static void te() {
        baseDao = new BaseDao();
    }

    @Test
    public void testBase1() {
        String str = "SELECT count(*) FROM sys_user;";
        Long l = baseDao.baseQueryObject(Long.class, str);
        System.out.println(l);
    }

    @Test
    public void testc() {
        String sql="select uid,username,user_pwd as userPwd from sys_user";
        List<SysUser> objects = baseDao.baseQuery(SysUser.class, sql);
        objects.forEach(value-> System.out.println(value));
    }

    @Test
    public void testjia(){
        String sql="insert into sys_schedule values(null,?,?,?)";
        int rows = baseDao.baseUpdate(sql, 1, "学习java", 0);
        System.out.println(rows);
    }
}
