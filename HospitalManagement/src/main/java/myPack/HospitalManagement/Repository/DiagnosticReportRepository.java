package myPack.HospitalManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import myPack.HospitalManagement.Entity.DiagnosticReport;
import myPack.HospitalManagement.Entity.Patient;

@Repository
public interface DiagnosticReportRepository extends JpaRepository<DiagnosticReport, Long>
{
	public DiagnosticReport findById(long id);
	public DiagnosticReport deleteById(long id);
	public DiagnosticReport findByPatient(Patient patient);
}	