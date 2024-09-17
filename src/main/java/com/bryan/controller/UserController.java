package com.bryan.controller;

import com.bryan.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * ClassName: UserController
 * Package: com.kuang.controller
 * Description:
 *
 * @Author: Bryan Long
 * @Create: 2024/9/17 - 14:38
 * @Version: v1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login() {
        System.out.println("login request");

        return "login";
    }

    @RequestMapping("/submit")
    public String submit(HttpSession session, @RequestParam String username, @RequestParam String password) {
        System.out.println("submit request");

        User user = new User(1, username, password);

        session.setAttribute("user", user);

        return "home";
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println("home request");
        return "home";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        System.out.println("logout request");

        session.removeAttribute("user");

        return "login";
    }
}
