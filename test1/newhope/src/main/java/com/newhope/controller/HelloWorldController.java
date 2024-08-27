package com.newhope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloWorldController {
    


@GetMapping("/home")
public String showHome(){
    return "Home";
}

@GetMapping("/Trainings")
public String showTrainings(){
    return "Trainings";
}

@GetMapping("/info")
public String showInfo(){
    return "info";
}

@GetMapping("/Gallery")
public String showGallery(){
    return "Gallery";
}

@GetMapping("/Tournament")
public String showTournaments(){
    return "Tournament";
}


}





