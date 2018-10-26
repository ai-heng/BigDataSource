package com.itheima.web.filter;

import com.itheima.装饰设计模式.BaseStudent;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GenericEncodingFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //1. 解决提交时的乱码问题.
        //因为get方式和post方式解决乱码问题的思路不一样, 所以我们要先获取到: 浏览器提交数据的方式.
        //1.1 向下转型
        HttpServletRequest hsr = (HttpServletRequest)request;

        //1.2 因为hsr和request是一回事, 所以我们升级request的功能, 就是升级hsr的功能.
        //1.3 升级hsr的功能, 解决提交时的乱码问题, 主要升级: getParameter(), getParameterMap();
        hsr = new MyServletRequest(hsr);

        //2. 解决响应时的乱码问题.
        response.setContentType("text/html;charset=utf-8");

        //3. 放行
        chain.doFilter(hsr, response);
    }

    //      装饰类
    class MyServletRequest extends HttpServletRequestWrapper {
        //1. 在装饰类中, 获取被装饰的类的应用.
        private HttpServletRequest hsr;

        //2. 将其作为参数, 传给装饰类的构造方法.
        public MyServletRequest(HttpServletRequest hsr) {
            super(hsr);     //因为父类没有空参构造, 我们只能调用其带参构造.
            this.hsr = hsr;
        }

        //最终Boss, 只需要对getParameterMap()方法调用一次, 即可解决所有的: 乱码问题.
        boolean flag = true;    //true: 表示需要处理, false: 表示不需要处理.

        //3. 对其指定的功能, 进行升级.
        @Override
        public Map<String, String[]> getParameterMap() {
            //3.1 获取提交方式.
            String method = hsr.getMethod();
            //3.2 判断提交方式
            if ("post".equalsIgnoreCase(method)) {
                //解决post的乱码问题
                try {
                    hsr.setCharacterEncoding("utf-8");
                    return hsr.getParameterMap();   //处理后的结果.
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }

            } else if("get".equalsIgnoreCase(method)) {     //李云龙, 老李
                //解决get方式的乱码问题
                //a. 获取要操作的数据(进行乱码处理前的数据)
                Map<String, String[]> map = hsr.getParameterMap();
                //b. 遍历数组, 获取到每一个值, 依次处理即可.
                if (map != null) {
                 if (flag) {
                       for (String key : map.keySet()) {
                           String[] values = map.get(key);     //values数组记录的就要操作的值.     //李云龙, 老李, [打仗, 喝酒, 骂人]
                           //c. 因为有可能涉及到的是: 复选框, 所以这里继续遍历
                           if (values != null) {
                               //这里必须用普通for
                               for (int i = 0; i < values.length; i++) {
                                   //values[i]: 就是具体的要操作的每一个数据.
                                   try {
                                       values[i] = new String(values[i].getBytes("iso-8859-1"),"utf-8");
                                   } catch (UnsupportedEncodingException e) {
                                       e.printStackTrace();
                                   }
                               }
                           }

                      }
                       flag =  false;   //处理完之后, 下次就不处理了.
                   }
                }
                //d. 将处理后的结果返回.
                return map;
            }

            //3.3 如果不是get和post提交方式, 该怎么处理就怎么处理.
            return this.getParameterMap();
        }

        @Override
        public String getParameter(String name) {
            //核心思路: 根据名字去我们处理后的: 双列集合中找即可.
            //1. 获取处理后的双列集合中的所有数据.
            Map<String, String[]> map = this.getParameterMap();
            String[] values = map.get(name);
            return values != null && values.length > 0 ?  values[0] : null;
        }
    }





















    public void init(FilterConfig config) throws ServletException {

    }
    public void destroy() {
    }


}
