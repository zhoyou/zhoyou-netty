package com.github.zhoyou;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhhongyu
 * @description:
 * @since: Create in 20:47 2019/12/4
 */
public class MemberProviderBootstrap {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("Provider started.");
        System.in.read(); // press any key to exit
    }
}
