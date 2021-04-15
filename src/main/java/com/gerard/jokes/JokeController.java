package com.gerard.jokes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeServiceImpl jokesService;

    public JokeController(JokeServiceImpl jokesService){
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "index";
    }
}
