package com.ooqiu.gaming.server.web.admin.module.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 14:19 2019/5/14
 * @Modified By: BernardLowe
 */
@Controller
public class LoginController {
    /**
     * @Description: 跳转登录界面
     * @auther: BernardLowe
     * @date: 14:20 2019/5/14
     * @param: []
     * @return: java.lang.String
     */
    @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
    public String login() {
        return "modules/login/login";
    }

    /**
     * @Description: 登录
     * @auther: BernardLowe
     * @date: 14:54 2019/5/14
     * @param: [username, password, model]
     * @return: java.lang.String
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password, Model model) {

        // 模拟账号密码登录
        if ("admin@admin.com".equals(username)
                && "123456".equals(password)) {
            return "redirect:/main";
        }

        // 账号或密码错误
        else {
            model.addAttribute("message", "邮箱或密码错误，请重试！");
        }

        return "modules/login/login";
    }
}
