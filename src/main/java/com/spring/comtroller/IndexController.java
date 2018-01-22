package com.spring.comtroller;

import com.spring.entity.User;
import com.spring.mapper.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @Autowired
    private Login login;
    @RequestMapping(value = "login")
    public String indexReturn(@RequestParam("username") String username,
                              @RequestParam("password") String password){
        User user = login.login(username,password);
        return user == null ? "error":"success";
    }
    @RequestMapping("index")
    public String ret(){
        return "index";
    }
}
