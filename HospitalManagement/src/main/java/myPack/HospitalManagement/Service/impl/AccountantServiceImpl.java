package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.Accountant;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.AccountantRepository;
import myPack.HospitalManagement.Service.AccountantService;
@Service
public class AccountantServiceImpl implements AccountantService
{
	@Autowired
    private AccountantRepository accountantRepository;

    @Override
    public List<Accountant> getAllAccountants() {
        return accountantRepository.findAll();
    }

    @Override
    public Accountant getAccountantById(Long id) {
        return accountantRepository.findById(id).orElse(null);
    }

    @Override
    public Accountant saveAccountant(Accountant accountant) {
        return accountantRepository.save(accountant);
    }

    @Override
    public Accountant updateAccountant(Long id, Accountant accountant) {
        Optional<Accountant> existingAccountant = accountantRepository.findById(id);
        if (existingAccountant.isPresent()) {
            accountant.setId(id);
            return accountantRepository.save(accountant);
        }
        return null;
    }

    @Override
    public void deleteAccountant(Long id) {
        accountantRepository.deleteById(id);
    }
}

