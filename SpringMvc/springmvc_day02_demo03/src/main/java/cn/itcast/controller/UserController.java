package cn.itcast.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.Map;;
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    public String test(String username, String password, String birthday) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(birthday);

        return "succes";
    }

    @RequestMapping("/test02")
    public void test2(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/pages/succes2.jsp").forward(request, response);
        //response.sendRedirect(request.getContextPath()+"succes2.jsp");
    }

    @RequestMapping("/testOne")
    public String testOne(String username, HttpServletRequest request, HttpSession session) {
        request.setAttribute("username", username);
        session.setAttribute("age", 18);
        return "successs";
    }

    @RequestMapping("/testTwo")
    public ModelAndView testTwo(String username) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("username", username);
        mv.addObject("age", 12);
        mv.setViewName("successs");
        return mv;
    }

    @RequestMapping("/testThree")
    public String testThree(String username, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("age", 15);
        return "successs";
    }

    @RequestMapping("/testFour")
    public String testFour(String username, Map map) {
        map.put("username", username);
        map.put("age", 18);
        return "successs";

    }



}

