package AOP.AOP_Schema_Base;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBe4Advice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行前置事件");
        System.out.println("切点方法对象："+method+",方法名："+method.getName());
        System.out.println("切点方法参数数组："+args);
        System.out.println("切点所在的对象："+target);
    }
}
