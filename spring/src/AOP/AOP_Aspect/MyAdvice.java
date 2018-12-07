package AOP.AOP_Aspect;

public class MyAdvice {
    public void myBe4Advice(String arg0_String,int arg1_int){
        System.out.println("aspect前置,str："+arg0_String+"int:"+arg1_int);
    }
    /*public void myAfterAdvice(){
        System.out.println("aspect后置");
    }
    public void myAfterReturnAdvice(){
        System.out.println("aspect-after-returning后置");
    }
    public Object myarround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("ascept-前置");
        Object result = proceedingJoinPoint.proceed();
        System.out.println("ascept-后置");
        return result;

    }*/
    /*public void aspectThrowAdvice(Exception e){
        System.out.println("触发异常:"+e.getMessage());
    }*/

}
