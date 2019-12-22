package com.itheima.ui;

import com.itheima.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    /**
     * 获取spring的IoC核心容器，并根据id获取对象
     * @param args
     */
    public static void main(String[] args) {
        // 1. 获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\zhenhui\\Desktop\\bean.xml");
        // 2. 根据id获取Bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        as.saveAccount();

        ac.close();
    }
}
