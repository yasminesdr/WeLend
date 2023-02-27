package com.pidev.welend.controllers;

import com.pidev.welend.entities.Account;
import com.pidev.welend.services.IAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Account")
public class AccountController {
    @Autowired
    IAccountService AccService ;
    //@PostMapping("/AddAccount/{cinClient}")

    @PostMapping("/AddAccount")
    @ResponseBody
    //public Account AddAccount (@RequestBody Account a , @PathVariable ("cinClient")  Integr idClient)
    public Account AddAccount (@RequestBody Account a)

    {
        return AccService.addAccount(a) ;
    }
    @PutMapping("/updateAccount/{id}")
    @ResponseBody
    public void upAcc (@RequestBody Account a ,@PathVariable("id") Integer id ) {
        AccService.updateAccount(a,id);
    }
    @DeleteMapping("/deleteAccount/{id}")
    @ResponseBody
    public void deleteAcc (@PathVariable("id") Integer id ) {
      AccService.deleteAccount(id);
    }
    @GetMapping("/Listaccounts")
    @ResponseBody
    public List<Account> getAllAcounts() {
        List <Account> list=AccService.retrieveAllAccounts();
        return list ;
    }


}
