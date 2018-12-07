package AOP.AOP_Schema_Base;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice {
    //AOP的Schema-base方式的异常处理需要实现ThrowsAdvice接口 此接口为标识接口，
    // 需要的实现的方法名为固定为afterThrowing 具体可参考源码.
    //有几个需要注意的地方：
    //1、就是原型对象的异常不能抓！一旦抓取就无法运行afterThrowing。
    //也就是只有出异常了，且没被抓，才会运行这个方法。
    //2、不能在运行的方法中直接new ThrowsAdvice然后实现afterThrowing方法，这样因为出异常，线程挂了，也会无法运行这个afterThrowing方法。
    public  void  afterThrowing(Exception e)  throws  Throwable{
        System.out.println("出异常了..."+e);
    }

}
