package org.curryware.currywarejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequestMapping("jokes")
public class ChuckJokeController {


    @GetMapping(value = "/getjoke", produces = "application/json")
    public @ResponseBody String getJoke() {

        return "{\"joke\": \"" + getJokeText() + "\"}";
    }

    @GetMapping(value = "/throw_java_error")
    public @ResponseBody String throwJavaError() {

        int otis = 1;
        otis = otis - 1;
        int scot = 1 / otis ;

        return String.valueOf(otis);
    }

    private String getJokeText() {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 4);
        return switch (randomNumber) {
            case 1 -> "Joke 1";
            case 2 -> "Joke 2";
            case 3 -> "Joke 3";
            default -> "";
        };
    }
}
