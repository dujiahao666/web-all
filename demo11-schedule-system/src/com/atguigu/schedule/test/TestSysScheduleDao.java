package com.atguigu.schedule.test;

import com.atguigu.schedule.dao.SysScheduleDao;
import com.atguigu.schedule.dao.impl.SysScheduleDaoimpl;
import com.atguigu.schedule.pojo.SysSchedule;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TestSysScheduleDao {
    private static SysScheduleDao schedule;
    @BeforeClass
    public static void init(){
        schedule =new SysScheduleDaoimpl();
    }

    @Test
    public void t1(){
        int rows = schedule.addSchedule(new SysSchedule(null, 2, "学习数据库", 1));
        System.out.println(rows);
    }

    @Test
    public void cha(){
        List<SysSchedule> all = schedule.findAll();
        all.forEach(schedule1 -> System.out.println(schedule1));
    }
}
