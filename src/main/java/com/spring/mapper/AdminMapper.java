package com.spring.mapper;

import com.spring.entity.AdminDO;

import java.sql.SQLException;

/**
 * dao - admin
 *
 * @auther ten
 */
public interface AdminMapper {
    /**
     * 注册 :
     * 插入AdminDO到admin表
     *
     * @param adminDO AdminDO
     */
    void insertAdmin(AdminDO adminDO);

    /**
     * 登录 :
     * 通过admin_name(uk)进行查询
     * 获取数据库admin信息
     *
     * @param adminName 用户名
     * @return AdminDO AdminDO
     * @throws NullPointerException 记录不存在
     */
    AdminDO queryAdminByName(String adminName);

    /**
     * 注册 :
     * 通过admin_name(uk)进行查询
     * 判断Admin对象是否存在
     *
     * @param adminName 用户名
     * @return boolean 用户名是否存在
     */
    boolean isAdminExisted(String adminName);
}