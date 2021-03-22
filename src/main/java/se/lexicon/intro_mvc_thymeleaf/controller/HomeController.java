package se.lexicon.intro_mvc_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String gotoIndexPage (){
        //System.out.println("Index");
        return "index";
    }

    @GetMapping ("/welcome")
    public String goToWelcomePage (){
        //System.out.println("WELCOME PAGE");
        return "welcome";
    }


}