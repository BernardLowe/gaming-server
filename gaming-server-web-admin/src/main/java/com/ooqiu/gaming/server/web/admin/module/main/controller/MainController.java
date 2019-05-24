package com.ooqiu.gaming.server.web.admin.module.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页
 * <p>Title: MainController</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/4/13 16:09
 */
@Controller
public class MainController {

    /**
     * 跳转入口页
     *
     * @return
     */
    @RequestMapping(value = "main", method = RequestMethod.GET)
    public String main() {
        return "modules/main/main";
    }

    /**
     * 跳转首页
     * @return
     */
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home() {
        return "modules/main/home";
    }
}
