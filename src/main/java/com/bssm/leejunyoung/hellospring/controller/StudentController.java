package com.bssm.leejunyoung.hellospring.controller;

import com.bssm.leejunyoung.hellospring.domain.Student;
import com.bssm.leejunyoung.hellospring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students/new")
    public String createForm() {
        return "students/createStudentForm";
    }

    @PostMapping("/students/new")
    public String create(StudentForm form) {
        Student student = new Student();
        student.setId(form.getId());
        student.setName(form.getName());
        //service를 부른다. student를 같이 넘김
        service.edit(student);
        return "redirect:/";
    }
}
