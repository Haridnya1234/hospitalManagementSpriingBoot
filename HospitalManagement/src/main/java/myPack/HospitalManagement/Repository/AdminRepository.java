package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import myPack.HospitalManagement.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>
{

	public Admin findById(long id);
	public Admin deleteById(long id);
	public Admin findByUsername(String username);

}

