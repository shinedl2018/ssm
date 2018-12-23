package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ajax")
public class AjaxController {

    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax( User user2){
        System.out.println(user2);
        System.out.println(1);
        return user2;


    }
}
