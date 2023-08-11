package myPack.HospitalManagement.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myPack.HospitalManagement.Entity.Receptionist;
import myPack.HospitalManagement.Service.ReceptionistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/receptionists")
@CrossOrigin("*")
public class ReceptionistController {

    @Autowired
    private ReceptionistService receptionistService;

    @GetMapping ("/getAllReceptionists")
    public List<Receptionist> getAllReceptionists() {
        return receptionistService.getAllReceptionists();
    }

    @GetMapping("/{id}")
    public Receptionist getReceptionistById(@PathVariable Long id) {
        return receptionistService.getReceptionistById(id);
    }

    @PostMapping("/postReceptionist")
    public Receptionist addReceptionist(@RequestBody Receptionist receptionist) {
        return receptionistService.saveReceptionist(receptionist);
    }

    @PutMapping("/{id}")
    public Receptionist updateReceptionist(@PathVariable Long id, @RequestBody Receptionist receptionist) {
        return receptionistService.updateReceptionist(id, receptionist);
    }

    @DeleteMapping("/putReceptionist")
    public void deleteReceptionist(@PathVariable Long id) {
        receptionistService.deleteReceptionist(id);
    }
}


