package cn.itcast.controller;

import cn.itcast.pojo.Book;
import cn.itcast.pojo.User;
import cn.itcast.pojo.UserForm;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping("show1")
    public ModelAndView show1() {
        ModelAndView mv = new ModelAndView("hello");
        // 向域容器中存放数据
        mv.addObject("msg", "show1 这是springmvc学习的第二天!" + new Date().toLocaleString());
        return mv;
    }

    // 需求: 将pojo对象集合保存mv中 且 在浏览器中显示
    @RequestMapping("show2")
    public ModelAndView show2() {
        ModelAndView mv = new ModelAndView("book_list");
        // 向域容器中存放数据
        List<Book> bookList = new ArrayList<Book>();
        for(int i=1; i<=10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("笑傲江湖_" + i);
            book.setPrice(10 + i);

            bookList.add(book);
        }
        mv.addObject("bookList", bookList);
        return mv;
    }

    // 需求: 将bookList转成json返回给客户端
    @RequestMapping("show3")
    @ResponseBody
    public List<Book> show3() {
        // 向域容器中存放数据
        List<Book> bookList = new ArrayList<Book>();
        for(int i=1; i<=10; i++) {
            Book book = new Book();
            book.setId(i);
            book.setName("笑傲江湖_" + i);
            book.setPrice(10 + i);

            bookList.add(book);
        }
        return bookList;
    }

    // 需求: 只需要返回视图名称
    @RequestMapping("show4")
    public String show4(Model model) {
        model.addAttribute("msg", "我真的很棒,很棒!");
        return "index";
    }

    // 需求: 使用重定向访问 show1.do
    @RequestMapping("show5")
    public String show5() {
        return "redirect:http://www.baidu.com";
    }

    // 需求: 使用请求转发访问 show1.do
    @RequestMapping("show6")
    public String show6() {
        return "forward:/show1.do";
    }

    // 需求: 不想返回任何内容
    @RequestMapping("show7")
    // @ResponseStatus(HttpStatus.OK) 对内通知springmvc框架我已经处理完了, 对外通知客户端 我收到了你的请求
    @ResponseStatus(HttpStatus.OK)
    public void show7() {
        System.out.println("我收到了你的请求,但是我什么也不想干 .... ....................");
    }

    // 需求: 获取request, response, session等相关对象
    @RequestMapping("show8")
    public ModelAndView show8(HttpServletRequest request,
                              HttpServletResponse response,
                              HttpSession session) {

        request.setAttribute("msg1", "我是request容器,我存放了数据 ... ... " + request);
        request.setAttribute("msg2", "我是response对象,我被放到了request中 ... ... " + response);
        session.setAttribute("msg3", "我是session容器,我存放了数据 ... ... " + session);

        ModelAndView mv = new ModelAndView("servlet-test");
        mv.addObject("msg", "我是哪个域?"); // page? request? session? servletContext?
        return mv;
    }

    // 需求: 占位符参数 localhost/show9/{name}/{age}
    @RequestMapping("/show9/{name}/{age}")
    public ModelAndView show9(@PathVariable("name") String name,
                               @PathVariable("age") int age) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "获取占位符参数: name = " + name + ", age = " + age);
        return mv;
    }

    // 需求: 获取表单中的参数
    // BeanUtils.populater(bean, request.getParameterMap()); // 将map的数据 复制到javabean中
    @RequestMapping("show10")
    public ModelAndView show10(@RequestParam("name") String name,
                               @RequestParam("age") int age,
                               @RequestParam("income") double income,
                               @RequestParam("isMarried") boolean isMarried,
                               @RequestParam("interests") String[] interests
                               ) {
        String paramStr = "姓名 : " + name + ", " +
                            "年龄 : " + age + ", " +
                            "收入 : " + income + ", " +
                            "是否结婚 : " + isMarried + ", " +
                            "爱好 : " + Arrays.toString(interests);

        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "获取表单的普通参数 : paramStr = " + paramStr);
        return mv;
    }

    // 需求: 将参数封装到javabean中 user对象中
    @RequestMapping("show11")
    public ModelAndView show11(User user) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "将参数封装到javabean中 user对象中 : user = " + user);
        return mv;
    }

    // 需求: @requestParam的详细介绍
    @RequestMapping("show12")
    public ModelAndView show12(@RequestParam(value="password", required = false, defaultValue = "123456") String password) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "@requestParam的详细介绍 : password = " + password);
        return mv;
    }

    // 需求: 获取cookie的值
    @RequestMapping("show13")
    public ModelAndView show13(@CookieValue("JSESSIONID") String jsessionid) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "获取cookie的值 : jsessionid = " + jsessionid);
        return mv;
    }

    // 需求: 将多个用户的信息 封装到list中
    @RequestMapping("show14")
    public ModelAndView show14(UserForm userForm) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "将多个用户的信息 封装到list中 : userForm = " + userForm);
        return mv;
    }

    // 需求: 将前端传的json数据转移到javabean中
    @RequestMapping("show15")
    public ModelAndView show15(@RequestBody() Book book) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "将前端传的json数据转移到javabean中 : book = " + book);
        return mv;
    }

    // 需求: 将前端传的json数据转移到保存javabean的list中
    @RequestMapping("show16")
    public ModelAndView show16(@RequestBody() List<Book> bookList) {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "将前端传的json数据转移到保存javabean的list中 : bookList = " + bookList);
        System.out.println("========================================");
        for (Book book : bookList) {
            System.out.println(book);
        }
        return mv;
    }

    // 需求: 完成文件上传
    @RequestMapping("show17")
    public ModelAndView show17(@RequestParam("file1") MultipartFile file) throws IOException {
        ModelAndView mv = new ModelAndView("hello");
        if(file!=null) {
            // 指定上传位置
            file.transferTo(new File("E:/upload/" + file.getOriginalFilename()));
        }
        mv.addObject("msg", "文件上传成功! " + file.getOriginalFilename());
        return mv;
    }


}
