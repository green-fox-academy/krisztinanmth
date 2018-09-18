package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {


  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount bankAccount = new BankAccount("simba", 2000, "lion", true);
    model.addAttribute("bankAccount", bankAccount);
    //these 3 lines below are the same as the one line above, just Kond taught me that it's better and
    //simpler this way to pass it as one object
//    model.addAttribute("name", bankAccount.getName());
//    model.addAttribute("balance", bankAccount.getBalance());
//    model.addAttribute("animalType", bankAccount.getAnimalType());
    System.out.println(bankAccount.getBalance());
    return "show-bankAccount";
  }

  @GetMapping("/enjoy")
  public String enjoyYourself(Model model) {
    String message = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("enjoyYourself", message);
    return "enjoyYourself";
  }

  @GetMapping("/show/list")
  public String showListOfBankAccounts(Model model) {
    List<BankAccount> allBankAccounts = Arrays.asList(new BankAccount("simba", 4000, "lion", true),
      new BankAccount("nala", 600, "lion", true),
      new BankAccount("zazu", 1000, "bird", false),
      new BankAccount("banzai", 2300, "something", false));
    model.addAttribute("bankList", allBankAccounts);
    return "show-allBankAccounts";
  }
}
