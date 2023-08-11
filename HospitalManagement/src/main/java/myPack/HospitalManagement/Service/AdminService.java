package myPack.HospitalManagement.Service;

import myPack.HospitalManagement.Entity.Admin;

public interface AdminService 
{
	public Admin createAdmin(Admin admin);

	public void deleteAdmin(Long id);
		
	public Admin updateAdmin(Admin admin);

	public Admin getAdmin(String username);
			
}
