package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.UnsupportedEncodingException;
import java.util.Date;

@Controller
// @RequestMapping("/test")
public class TestController {

    @RequestMapping("/show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "=========== 这是我的第一个注解程序!" + new Date().toLocaleString());
        return mv;
    }

    @RequestMapping("show2")
    public ModelAndView show2() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "============================= show2 这是我的第二个注解程序!" + new Date().toLocaleString());
        return mv;
    }

    @RequestMapping("/show3/**")
    public ModelAndView show3() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "show3 Ant风格映射: " + new Date().toLocaleString());
        return mv;
    }

    // 需求: 获取路径 中 http://localhost/show4/2342342.do  的 '2342342'
    @RequestMapping("/show4/{id}")
    public ModelAndView show4(@PathVariable("id") String id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "占位符映射: id = " + id);
        return mv;
    }

    // 需求: 更改 post请求方式
    @RequestMapping(value = "/show5", method = RequestMethod.POST)
    public ModelAndView show5() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "如果你看到了这句话,表示这个一个post请求!");
        return mv;
    }

    // 需求: 获取参数
    @RequestMapping(value = "/show6", method = RequestMethod.POST)
    public ModelAndView show6(@RequestParam("name") String name,
                               @RequestParam("city") String city) throws UnsupportedEncodingException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg", "获取参数: name = " + name + ", city = " + city);
        return mv;
    }

}
