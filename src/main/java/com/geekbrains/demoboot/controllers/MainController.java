package com.geekbrains.demoboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
//@RequestMapping("/main")
public class MainController {
//    @GetMapping
//    public String index() {
//        return "index";
//    }
//
//    @GetMapping("/secured")
//    public String secured() {
//        return "index";
//    }

    @GetMapping("/form")
    public String showForm() {
        return "simple-form";
    }

    @PostMapping("/form")
    public String saveForm(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email) {
        System.out.println(name);
        System.out.println(email);
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String doSomething() {
        return "index";
    }

    @GetMapping("/hello") ///{name}/{color}
    public String helloRequest(Model model, @RequestParam(value = "name") String name) { //@PathVariable
        model.addAttribute("name", name);
        return "hello";
    }

//    thymeleaf protect xss:
//    http://localhost:8189/demo/hello/?name=%3Cscript%3Ealert(1);%3C/script%3E
//    http://localhost:8189/demo/hello/%3Cscript%3Ealert(1);%3C/script%3E

//    @GetMapping("/hello")
//    @ResponseBody
//    public Cat helloRequest() {
//        return new Cat(1L, "Barsik", "red");
//    }

    @GetMapping("/addcat")
    public String showAddCatForm(Model model) {
        Cat cat = new Cat(1L, null, null);
        model.addAttribute("cat", cat);
        return "cat-form";
    }

    @PostMapping("/addcat")
    public String showAddCatForm(@ModelAttribute(value = "cat") Cat cat) {
        System.out.println(cat.getId() + " " + cat.getName() + " " + cat.getColor());
        return "redirect:/index";
    }
}
