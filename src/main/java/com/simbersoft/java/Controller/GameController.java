package com.simbersoft.java.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/game")
public class GameController {

    @GetMapping("")
    public String game (Model model){
        return "game/index";
    }

    @GetMapping("/game/choisePlayer")
    public String choisePlayer (Model model){
        return "game/index";
    }

}
