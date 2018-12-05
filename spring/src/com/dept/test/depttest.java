package com.dept.test;


import com.dept.dto.DeptDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class depttest {
    public static void main(String[] args) {
        /*通过IOC创建对象*/
        ApplicationContext ac =new ClassPathXmlApplicationContext("applicationContext.xml");
        DeptDTO dept = ac.getBean("dept", DeptDTO.class);

        /*查看spring管理的类*/
        String[] names = ac.getBeanDefinitionNames();
        for(String str:names){
            System.out.println(str);
        }
    }
}
