package com.simbersoft.java.Controller;

import com.simbersoft.java.Repository.UserRepository;
import com.simbersoft.java.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class MainController {

   // @Autowired
   // UserRepository userRepository;

    @GetMapping
    public String home (Model model) {
        return "home/index";
    }
/*
    @PostMapping("/")
    public String addNewUser (@RequestParam("name") String name, @RequestParam("score") Integer score) {
        User n = new User(name,score);
        userRepository.save(n);
        return "home/index";
    }



    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

 */
}
