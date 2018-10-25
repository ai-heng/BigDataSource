package cn.itcast.controller;

import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // 转账
    @RequestMapping("/transfer/{out}/{in}/{money}")
    public ModelAndView transfer(@PathVariable("out") String outAccount,
                                 @PathVariable("in") String inAccount,
                                 @PathVariable("money") double money) {

        // 调用业务层 进行转账业务
        accountService.transfer(outAccount, inAccount, money);

        ModelAndView mv = new ModelAndView("success");
        mv.addObject("msg", "转账成功!");
        return mv;
    }

    // 转账
    @ExceptionHandler({Exception.class})
    public ModelAndView handlerException(Exception ex) {
        // 调用接口,给主要负责人 发语音,发邮件 等方式通知报错了,需要立刻处理

        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorMsg", ex);
        return mv;
    }
}
