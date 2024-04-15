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

import java.util.HashMap;
import java.util.Map;

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

        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));

            model.addAttribute("errors", errors);
            model.addAttribute("user", userProfile);
            return "user/retry";
        }
        return "redirect:/api/users/login";
    }
}