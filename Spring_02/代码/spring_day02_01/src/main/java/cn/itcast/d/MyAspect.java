package cn.itcast.d;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

// 增强类
public class MyAspect {

    // 前置通知
    public void before(JoinPoint joinPoint) {
        System.out.println("=============1 前置通知: 获取连接,开启事务....");
    }

    // 后置通知
    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("=============2 后置通知: 提交事务 生效....");
    }

    // 最终通知
    public void after(JoinPoint joinPoint) {
        System.out.println("=============3 最终通知: 释放资源....");
    }

    // 异常通知
    public void afterThrow(JoinPoint joinPoint, Exception ex) {
        System.out.println("=============4 异常通知: 回滚事务 撤销.... 异常原因:" + ex.getMessage());
        System.out.println(" ===================== 发语音,发短信,发邮件等 通知负责人, XX类XX方法报异常了");
    }

   // 环绕增强(环绕通知)
   public void around(ProceedingJoinPoint joinPoint) throws Throwable {
       try {
           // 1 获取连接,开启事务
           System.out.println("1 获取连接,开启事务 ... ...");
           // 2 执行一组sql语句
           joinPoint.proceed(); // 执行业务代码
           // 3.1 如果没有问题, 提交事务, 生效
           System.out.println("3.1 如果没有问题, 提交事务, 生效 ... ...");
       } catch (Exception e) {
           // 3.2 如果出现问题,回滚事务,撤销
           System.out.println("3.2 如果出现问题,回滚事务,撤销");
       } finally{
           // 4 释放资源
           System.out.println("4 释放资源");
       }

   }
}
