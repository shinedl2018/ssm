package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Map;;
@Controller
@RequestMapping("/user")
public class UserController{

    @RequestMapping("/test")
    public String test(String username,String password,Date birthday){
        System.out.println(username);
        System.out.println(password);
        System.out.println(birthday);

        return "succes";
    }


}
