package com.newhope.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newhope.models.LoginModel;

import jakarta.validation.Valid;



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
@GetMapping("/Login")
public String displayLoginForm(Model model) {

    model.addAttribute("loginModel" , new LoginModel() );
    return "loginForm";
}

@PostMapping("/processLogin")
public String processLogin( @Valid LoginModel loginModel,BindingResult bindingResult, Model model) {

    if(bindingResult.hasErrors()){
        model.addAttribute("loginModel", loginModel);
        return "loginForm";
    }

    model.addAttribute("loginModel", loginModel);
    return "loginResults";
}



}





