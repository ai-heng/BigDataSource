package cn.itcast.a;

import java.util.Date;

public class LogUtils {
    // 记录日志的方法
    public static void writeLog(String className, String methodName) {
        System.out.println(new Date().toLocaleString() + " : " + className + "类" + methodName + "方法执行了 ... ...");
    }
}
