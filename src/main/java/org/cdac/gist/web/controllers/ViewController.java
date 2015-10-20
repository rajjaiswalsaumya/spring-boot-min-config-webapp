package org.cdac.gist.web.controllers;

import org.cdac.gist.domain.bo.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by kamalp on 26-01-2015.
 */
@Controller
public class ViewController {
    @RequestMapping(value = {"/", "/index"})
    public String indexView() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginView(ModelMap map) {
        map.put("user", new LoginUser());
        return "login";
    }

    @RequestMapping(value = {"/welcome"})
    public String welcomeView(HttpSession session) {
        if (session.getAttribute("user") == null)
            return "redirect:/index";
        return "welcome";
    }

}
