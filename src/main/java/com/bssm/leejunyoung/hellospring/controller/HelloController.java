package com.bssm.leejunyoung.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

    @GetMapping("/hello/param") // hello/param?data=123
    @ResponseBody
    public String helloParam(@RequestParam("data") String data) {
        return "hello " + data;
    }

    @GetMapping("hi/param")
    public String hiParam(@RequestParam("data") String data, Model model) {
        model.addAttribute("data", data);
        return "hi";
    }

    @GetMapping("/hello/api")
    @ResponseBody
    public Person helloApi(@RequestParam("name") String name) {
        Person person = new Person(name, 19);
        return person;
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
