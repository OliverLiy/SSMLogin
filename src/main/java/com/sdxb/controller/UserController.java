package com.sdxb.controller;

import com.sdxb.pojo.User;
import com.sdxb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
// spring-mybatis.xml和springmvc-servlet.xml都配置了扫描控制层
@Controller
public class UserController {
    // 注入UserService
    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public String login(User user) {
        ModelAndView mv = new ModelAndView();
        user = userService.get(user);

        if (user != null) {
            mv.addObject("user", user);
            return "user";
        } else {
            return "login";
        }
    }
}
