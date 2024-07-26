package com.atguigu.schedule.pojo;

import java.io.Serializable;
import java.util.Objects;

public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

    public SysUser() {
    }

    public SysUser(Integer id, String username, String userPwd) {
        this.uid = id;
        this.username = username;
        this.userPwd = userPwd;
    }

    /**
     * 获取
     *
     * @return id
     */
    public Integer getId() {
        return uid;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(Integer id) {
        this.uid = id;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * 设置
     *
     * @param userPwd
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String toString() {
        return "SysUser{id = " + uid + ", username = " + username + ", userPwd = " + userPwd + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUser sysUser = (SysUser) o;
        return Objects.equals(uid, sysUser.uid) && Objects.equals(username, sysUser.username) && Objects.equals(userPwd, sysUser.userPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, userPwd);
    }
}
