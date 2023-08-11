package myPack.HospitalManagement.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import myPack.HospitalManagement.Entity.Admin;
import myPack.HospitalManagement.Repository.AdminRepository;
import myPack.HospitalManagement.Service.AdminService;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public Admin createAdmin(Admin admin) 
	{
		return this.adminRepository.save(admin);
	}
	
	@Override
	public void deleteAdmin(Long id) 
	{
		this.adminRepository.deleteById(id);
	}
	
	@Override
	public Admin updateAdmin(Admin admin) 
	{
		return this.adminRepository.save(admin);
	}
	
	@Override
	public Admin getAdmin(String username)
	{
		return this.adminRepository.findByUsername(username);
	}
	
}
