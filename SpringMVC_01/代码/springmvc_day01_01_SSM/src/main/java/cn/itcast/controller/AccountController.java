package cn.itcast.controller;

import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    // 需求: 接受转账参数, 完成转账业务
    @RequestMapping("/transfer/{out}/{in}/{money}")
    public ModelAndView zhuanzhang(@PathVariable("out") String outAccount,
                                   @PathVariable("in")String inAccount,
                                   @PathVariable("money")double money) {
        // 调用业务层 完成转账
        accountService.transfer(outAccount, inAccount, money);

        ModelAndView mv = new ModelAndView("success");
        mv.addObject("msg", "转账成功!");
        return mv;
    }
}
