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

import myPack.HospitalManagement.Entity.DiagnosticReport;
import myPack.HospitalManagement.Entity.Patient;
import myPack.HospitalManagement.Repository.DiagnosticReportRepository;
import myPack.HospitalManagement.Service.DiagnosticReportService;

@RestController
@RequestMapping("/diagnosticreports")
@CrossOrigin("*")

public class DiagnosticReportController
{
	@Autowired
    private DiagnosticReportService reportService;

    @GetMapping("/getAllReports")
    public List<DiagnosticReport> getAllDiagnosticReports() {
        return reportService.getAllDiagnosticReports();
    }

    @GetMapping("/{id}")
    public DiagnosticReport getDiagnosticReportById(@PathVariable Long id) {
        return reportService.getDiagnosticReportById(id);
    }

    @PostMapping("/postReport")
    public DiagnosticReport addDiagnosticReport(@RequestBody DiagnosticReport report) {
        return reportService.saveDiagnosticReport(report);
    }

    @PutMapping("/putReport")
    public DiagnosticReport updateDiagnosticReport(@PathVariable Long id, @RequestBody DiagnosticReport report) {
        return reportService.updateDiagnosticReport(id, report);
    }

    @DeleteMapping("/{id}")
    public void deleteDiagnosticReport(@PathVariable Long id) {
        reportService.deleteDiagnosticReport(id);
    }
}