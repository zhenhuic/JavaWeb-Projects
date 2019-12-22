package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {
    /**
     * 查询所以操作
     * @return
     */
    //@Select("select * from user")
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);

    /**
     * 根据 id 删除用户
     * @param user
     */
    void deleteUser(Integer userId);

    /**
     * 根据 id 查询用户信息
     * @param user
     */
    User findById(Integer userId);

    /**
     * 根据名称模糊查询用户信息
     * @param user
     */
    List<User> findByName(String username);

    /**
     * 查询总用户数
     * @param user
     */
    int findTotal();
}
