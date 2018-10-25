package cn.itcast.c;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 需求: 记录方法执行的时间
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        long start = System.currentTimeMillis();
        Object returnVal = invocation.proceed(); // 执行业务代码
        long end = System.currentTimeMillis();

        String className = invocation.getThis().getClass().getSimpleName();
        String methodName = invocation.getMethod().getName();
        System.out.println("spring 代理 对类的功能进行增强: " + className + "类" + methodName + "方法耗时"+ ( end - start)+ "毫秒!" );
        return returnVal;
    }
}
