package cn.itcast.controller;

import cn.itcast.pojo.PageBean;
import cn.itcast.pojo.User;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    // 需求: 用户列表显示
    @RequestMapping("list")
    @ResponseBody
    public PageBean<User> queryPageData(@RequestParam(value = "page", defaultValue = "1") int pageNum,
                                         @RequestParam(value = "rows", defaultValue = "5") int numPerPage) {
        PageBean<User> pageBean = userService.queryPageData(pageNum, numPerPage);
        return pageBean;
    }

    // 需求: 添加用户
    @RequestMapping("save")
    @ResponseBody
    public Map addUser(User user) {
        Map map = new HashMap();
        try {
            // 调用业务层 完成添加用户的功能
             userService.addUser(user);

            map.put("status", 200); // 成功
        }catch (Exception e) {
            e.printStackTrace();
            map.put("status", 500); // 失败
        }
        return map;
    }

    // 需求: 批量删除
    @RequestMapping("delete")
    @ResponseBody
    public Map delByIds(@RequestParam("ids") List<Long> ids) {
        Map map = new HashMap();
        try {
            // 调用业务层 完成批量删除的功能
            userService.delByIds(ids);

            map.put("status", 200); // 成功
        }catch (Exception e) {
            e.printStackTrace();
            map.put("status", 500); // 失败
        }
        return map;
    }


}
