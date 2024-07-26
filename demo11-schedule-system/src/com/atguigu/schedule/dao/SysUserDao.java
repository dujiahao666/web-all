package com.atguigu.schedule.dao;

import com.atguigu.schedule.pojo.SysUser;

public interface SysUserDao {
    int addSysuser(SysUser sysUser);

    SysUser findByUsername(String username);
}
