package spring.feature.sign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign")
public class SignController {

    @RequestMapping("/sign_up")
    public String signUp() {
        return "sign/sign_up";
    }

    @RequestMapping("/sign_in")
    public String signIn() {
        return "sign/sign_in";
    }
}