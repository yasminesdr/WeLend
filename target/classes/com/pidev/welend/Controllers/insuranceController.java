package com.pidev.welend.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/insurance")
public class insuranceController {
    @Autowired
    InsuranceService insuranceService;
    @PostMapping("/add")
    public insurance addInsurance(@RequestBody Insurance i){
        return insuranceService.addInsurance(i);
    }
    @PutMapping("/update")
    public Insurance updateInsurance(@RequestBody Insurance i){
        return insuranceService.updateInsurance(i);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteInsurance(@PathVariable("id") Integer insuranceID){
        insuranceService.deleteInsurance(insuranceID);
    }
    @GetMapping("/getAll")
    public List<Insurance> getAllInsurance(){
        return insuranceService.getAllInsurance();
    }
    @GetMapping("/getByID/{id}")
    public Insurance getByInsurance(@PathVariable("id") Integer insuranceID)
    {
        return insuranceService.getInsuranceById(insuranceID);
    }

}
