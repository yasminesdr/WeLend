package com.pidev.welend.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pidev.welend.services.insuranceTransactionService;
import com.pidev.welend.entities.insuranceTransaction;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/insuranceTransaction")
public class insuranceTransactionController {
    @Autowired
    insuranceTransactionService insuranceTransactionService;
    @PostMapping("/add")
    public insuranceTransaction addinsuranceTransaction(@RequestBody Insurance i){
        return insuranceService.addinsuranceTransaction(i);
    }
    @PutMapping("/update")
    public insuranceTransaction updateinsuranceTransaction(@RequestBody Insurance i){
        return insuranceTransactionService.updateinsuranceTransaction(i);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteinsuranceTransaction(@PathVariable("id") Integer insuranceTransactionID){
        insuranceTransactionService.deleteinsuranceTransaction(insuranceTransactionID);
    }
    @GetMapping("/getAll")
    public List<insuranceTransaction> getAllinsuranceTransaction(){
        return insuranceTransactionService.getAllinsuranceTransaction();
    }
    @GetMapping("/getByID/{id}")
    public insuranceTransaction getByinsuranceTransaction(@PathVariable("id") Integer insuranceTransactionID)
    {
        return insuranceTransactionService.getinsuranceTransactionById(insuranceTransactionID);
    }

}
