package com.sunxu.client;

import com.sunxu.prospring.MessageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 孙许
 * @Date 2019/11/30 20:08
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/app-context.xml");
        MessageProvider provider = ctx.getBean("provider", MessageProvider.class);
        provider.getMessage();
    }
}
