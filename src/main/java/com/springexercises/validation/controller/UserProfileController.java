package com.springexercises.validation.controller;

import com.springexercises.validation.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/users")
public class UserProfileController {

    @GetMapping(value = "/login")
    public String login() {
        return "user/login";
    }

    @PostMapping("/login")
    public String registerUser(Model model,
                               @Validated @ModelAttribute("user") UserProfile userProfile,
                               BindingResult bindingResult) {

        System.out.println(userProfile);

        if (bindingResult.hasErrors()) {
            StringBuilder errors = new StringBuilder();
            bindingResult.getAllErrors().forEach(error -> errors.append(error.getDefaultMessage()).append("\n"));
            System.out.println(errors);
            model.addAttribute("errors", errors.toString());
            model.addAttribute("user", userProfile);
            return "user/retry";
        }
        return "redirect:/api/users/login";
    }
}