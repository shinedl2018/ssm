package cn.itcast.controller;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String findLogin(User user, String ck, HttpSession session, HttpServletResponse response) throws Exception {
        User user1 = userService.findLogin(user);
        if(user1!=null){
            session.setAttribute("user",user1);
            Cookie cookieName = new Cookie("username",user.getUsername());
            Cookie cookiePassword = new Cookie("password",user.getPassword());

            System.out.println(user.getPassword());
            System.out.println(user.getName());

            if ("1".equals(ck)){
                cookieName.setMaxAge(7*24*60*60);
                cookiePassword.setMaxAge(7*24*60*60);
                //                 设置响应路径
                cookieName.setPath("/");
                cookiePassword.setPath("/");
            }else {
                cookieName.setMaxAge(0);
                cookiePassword.setMaxAge(0);
            }

////            将cookie响应到客户端
            response.addCookie(cookieName);
            response.addCookie(cookiePassword);

            return "index1";

        }else{
            return "loginError";
        }



    }



    @RequestMapping("/findAll")
    public String findAll(Model model,PageBean pageBean) throws Exception {
        if (pageBean!=null){
            if (pageBean.getPageNum() ==null){
                pageBean.setPageNum(1);
            }
            if (pageBean.getCount() ==null){
                pageBean.setCount(3);
            }

        }

        int counts =userService.findCount();
        pageBean.setCounts(counts);

        List<User> userList = userService.findAll(pageBean);
        model.addAttribute("userList", userList);
        model.addAttribute("pages",pageBean);


        return "list";
    }

    @RequestMapping("/update")
    public String updateUser(User user) throws Exception {
        userService.updateUser(user);
        return "redirect:/user/findAll";
    }

    @RequestMapping("/findUserById")
    public String findUserById(Model model, Integer id) throws Exception {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "update";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user) throws Exception {
        userService.updateUser(user);
        return "add";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Integer id)throws Exception{
        userService.deleteUser(id);
        return "forward:/user/findAll";
    }
}



