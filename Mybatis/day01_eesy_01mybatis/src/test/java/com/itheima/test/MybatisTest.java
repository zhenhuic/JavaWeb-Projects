package com.itheima.test;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * mybatis的入门案例
 */
public class MybatisTest {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before //用于在测试方法执行之前执行
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After //用于在测试方法执行之后执行
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() throws IOException {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }

    }


    /**
     * 测试保存操作
     */
    @Test
    public void testSave() throws IOException {
        User user = new User();
        user.setUsername("mybatis last insert id");
        user.setAddress("杭州市西湖区");
        user.setSex("男");
        user.setBirthday(new Date());

        System.out.println("保存操作之前" + user);
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        userDao.saveUser(user);
        System.out.println("保存操作之后" + user);

    }

    /**
     * 测试查询所有
     */
    @Test
    public void testUpdate() throws IOException {
        User user = new User();
        user.setId(50);
        user.setUsername("mybatis update User");
        user.setAddress("杭州市江干区");
        user.setSex("女");
        user.setBirthday(new Date());

        userDao.updateUser(user);

    }

    /**
     * 测试删除操作
     */
    @Test
    public void testDelete() {
        userDao.deleteUser(48);

    }

    /**
     * 测试根据id查询信息操作
     */
    @Test
    public void testFindOne() {
        User user = userDao.findById(46);
        System.out.println(user);

    }

    /**
     * 测试根据名称模糊查询操作
     */
    @Test
    public void testFindByName() {
        List<User> users = userDao.findByName("%王%");
        for (User user : users) {
            System.out.println(user);
        }

    }

    /**
     * 测试根据名称模糊查询操作
     */
    @Test
    public void testFindTotal() {
        int total = userDao.findTotal();
        System.out.println(total);

    }


    public static void main(String[] args) {
    }
}
