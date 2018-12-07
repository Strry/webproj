package AOP.AOP_Schema_Base;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行后置通知");
        //returnValue 切点方法的返回值
        //method 切点方法对象
        //args 参数数组
        //target 切点所在的对象
    }
}
