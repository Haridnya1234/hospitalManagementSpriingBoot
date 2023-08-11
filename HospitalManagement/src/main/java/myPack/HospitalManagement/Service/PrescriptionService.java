package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.Prescription;

public interface PrescriptionService
{
	 List<Prescription> getAllPrescriptions();
	    Prescription getPrescriptionById(Long id);
	    Prescription savePrescription(Prescription prescription);
	    Prescription updatePrescription(Long id, Prescription prescription);
	    void deletePrescription(Long id);
}
