package cn.itcast.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        // 返回视图名称:  根据视图名称找到指定具体的页面
        mv.setViewName("hello");
        // 设置数据: requet.setAttribute(name, value)
        mv.addObject("msg", "这是我的第一个springmvc程序!" + new Date().toLocaleString());
        return mv;
    }
}
