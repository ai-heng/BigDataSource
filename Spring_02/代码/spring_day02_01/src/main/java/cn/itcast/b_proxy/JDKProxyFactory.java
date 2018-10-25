package cn.itcast.b_proxy;

import cn.itcast.a.LogUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// jdk的动态代理: 前提: 必须有接口
public class JDKProxyFactory {
    private Object target;

    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    // 获取代理对象
    public Object getProxyObj() {
        // 1 第一个参数: 类加载器
        // 2 第二个参数: 被代理类的接口
        // 3 第三个参数: 增强的代码
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public java.lang.Object invoke(java.lang.Object proxy, Method method, java.lang.Object[] args) throws Throwable {
                        String className = target.getClass().getSimpleName();
                        String methodName = method.getName();

                        // 记录日志
                        LogUtils.writeLog(className, methodName);

                        Object returnVal = method.invoke(target, args); // 执行业务代码
                        return returnVal;
                    }
                });
    }
}
