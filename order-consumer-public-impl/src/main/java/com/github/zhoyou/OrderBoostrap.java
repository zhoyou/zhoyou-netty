package com.github.zhoyou;

import com.github.zhoyou.service.ZhoyouUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhhongyu
 * @description:
 * @since: Create in 21:59 2019/12/4
 */
public class OrderBoostrap {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        ZhoyouUserService zhoyouUserService = (ZhoyouUserService) context.getBean("zhoyouUserService");
        // Executing remote methods
        String hello = zhoyouUserService.getUser("1102010319");
        // Display the call result
        System.out.println(hello);
    }
}
