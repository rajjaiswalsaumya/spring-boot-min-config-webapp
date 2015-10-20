package org.cdac.gist.web.controllers;

import org.cdac.gist.domain.bo.LoginUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by grohit on 9/17/2015.
 */

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("user") LoginUser user, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            map.addAttribute("error", "Invalid username or password");
            return "login";
        } else
            return "redirect:/welcome";
    }


}
