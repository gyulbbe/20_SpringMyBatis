package com.feb.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginPage.do")
    public String loginForm() {
        return "login"; // 뷰 이름을 반환합니다.
    }

}
