package myPack.HospitalManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myPack.HospitalManagement.Entity.Accountant;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.AccountantRepository;
import myPack.HospitalManagement.Repository.PatientRepository;
import myPack.HospitalManagement.Service.AccountantService;
import myPack.HospitalManagement.Service.PatientService;
import myPack.HospitalManagement.Service.impl.AccountantServiceImpl;

@RestController
@RequestMapping("/accountants")
@CrossOrigin("*")

public class AccountantController 
{
	@Autowired
    private AccountantService accountantService;

    @GetMapping("/getAllAccountant")
    public List<Accountant> getAllAccountants() {
        return accountantService.getAllAccountants();
    }

    @GetMapping("/{id}")
    public Accountant getAccountantById(@PathVariable Long id) {
        return accountantService.getAccountantById(id);
    }

    @PostMapping("/postAccountant")
    public Accountant addAccountant(@RequestBody Accountant accountant) {
        return accountantService.saveAccountant(accountant);
    }

    @PutMapping("/putAccountant")
    public Accountant updateAccountant(@PathVariable Long id, @RequestBody Accountant accountant) {
        return accountantService.updateAccountant(id, accountant);
    }

    @DeleteMapping("/{id}")
    public void deleteAccountant(@PathVariable Long id) {
        accountantService.deleteAccountant(id);
    }
}