package AOP.AOP_Schema_Base;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕前置");
        Object result = methodInvocation.proceed();//类似servlet filter的dochain方法 result为返回值
        System.out.println("环绕后置");

        return result;
    }
}
