package com.rns.billdue.service.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MainController {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(MainController.class, args);
  }

  @RequestMapping("/")
  @ResponseBody String index() {
    return "index";
  }


}
