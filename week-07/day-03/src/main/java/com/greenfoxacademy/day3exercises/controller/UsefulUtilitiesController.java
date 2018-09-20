package com.greenfoxacademy.day3exercises.controller;

import com.greenfoxacademy.day3exercises.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {

  UtilityService utilityServices;

  @Autowired
  public UsefulUtilitiesController(UtilityService utilityServices) {
    this.utilityServices = utilityServices;
  }

  @GetMapping("/useful")
  public String showUseful(Model model) {
    model.addAttribute("allcolors", utilityServices.getColors());
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String showRandomColored(Model model) {
    model.addAttribute("random", utilityServices.randomColor());
    return "random";
  }

  @GetMapping("/useful/{specColor}")
  public String showSpecificColor(@PathVariable (value="specColor") String color, Model model) {
    model.addAttribute("random", color);
    return "random";
  }

  @GetMapping("/useful/email")
  public String getEmail(@RequestParam(value="email") String email, Model model) {
    if (utilityServices.validateEmail(email)) {
      model.addAttribute("text", email + " is a valid email address");
    }
    else {
      model.addAttribute("text", email + "is not a valid email address");
    }
    model.addAttribute("isValid", utilityServices.validateEmail(email));
    return "validEmail";
  }

  @GetMapping("/useful/encode/{text}/{number}")
  public String encode(@PathVariable(value="text") String text, @PathVariable(value="number") int number, Model model) {
    model.addAttribute("word", text);
    model.addAttribute("encodedWord", utilityServices.caesar(text, number));
    return "ceasar";
  }

  @GetMapping("/useful/decode/{text}/{number}")
  public String decode(@PathVariable(value="text") String text, @PathVariable(value="number") int number, Model model) {
    model.addAttribute("wordToDecode", text);
    model.addAttribute("decodedWord", utilityServices.caesar(text, -number));
    return "ceasarDecoded";
  }
}
