package myPack.HospitalManagement.Service;


import java.util.List;

import myPack.HospitalManagement.Entity.Receptionist;



public interface ReceptionistService {
    List<Receptionist> getAllReceptionists();
    
    Receptionist getReceptionistById(Long id);
    
    Receptionist saveReceptionist(Receptionist receptionist);
    
    Receptionist updateReceptionist(Long id, Receptionist receptionist);
    
    void deleteReceptionist(Long id);
}