package cn.itcast.b_proxy;

import cn.itcast.a.LogUtils;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyObject() {
        // 1 创建增强类对象
        Enhancer enhancer = new Enhancer();
        // 2 确定对哪个类进行增强
        enhancer.setSuperclass(target.getClass());
        // 3 设置回调函数, 当执行对应的目标方法时,执行增强代码
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 记录日志
                String className = target.getClass().getSimpleName();
                String methodName = method.getName();
                LogUtils.writeLog(className, methodName);

                return methodProxy.invoke(target, args);
            }
        });
        // 4 返回生成的代理对象
        return enhancer.create();
    }
}
