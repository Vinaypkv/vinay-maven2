package com.example.vinaymaven2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String index() {
      return "Greetings from Python Life DevOPS Class Today - April 2023 !";
  }

}