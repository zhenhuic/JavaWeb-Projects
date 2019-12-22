package com.itheima.ui;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

    /**
     * 获取spring的IoC核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
////        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhenhui\\Desktop\\bean.xml");
//        // 2. 根据id获取Bean对象
//        IAccountService as = (IAccountService) ac.getBean("accountService");
//        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);

        //-------------BeanFactory----------------
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        IAccountService as = (IAccountService) factory.getBean("accountService");
        System.out.println(as);

    }
}
