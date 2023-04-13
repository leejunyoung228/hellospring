package com.bssm.leejunyoung.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping("/students/new")
    public String createForm() {
        return "students/createStudentForm";
    }
}
