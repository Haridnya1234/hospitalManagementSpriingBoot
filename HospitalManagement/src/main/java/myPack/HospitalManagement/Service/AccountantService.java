package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Accountant;

public interface AccountantService 
{
	List<Accountant> getAllAccountants();
    Accountant getAccountantById(Long id);
    Accountant saveAccountant(Accountant accountant);
    Accountant updateAccountant(Long id, Accountant accountant);
    void deleteAccountant(Long id);
	
}
