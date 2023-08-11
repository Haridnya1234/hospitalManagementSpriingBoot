package myPack.HospitalManagement.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myPack.HospitalManagement.Entity.DiagnosticReport;
import myPack.HospitalManagement.Repository.DiagnosticReportRepository;
import myPack.HospitalManagement.Service.DiagnosticReportService;
import myPack.HospitalManagement.Repository.DiagnosticReportRepository;

@Service
public class DiagnosticReportServiceImpl implements DiagnosticReportService
{
	 @Autowired
	    private DiagnosticReportRepository reportRepository;

	    @Override
	    public List<DiagnosticReport> getAllDiagnosticReports() {
	        return reportRepository.findAll();
	    }

	    @Override
	    public DiagnosticReport getDiagnosticReportById(Long id) {
	        return reportRepository.findById(id).orElse(null);
	    }

	    @Override
	    public DiagnosticReport saveDiagnosticReport(DiagnosticReport report) {
	        return reportRepository.save(report);
	    }

	    @Override
	    public DiagnosticReport updateDiagnosticReport(Long id, DiagnosticReport report) {
	        Optional<DiagnosticReport> existingReport = reportRepository.findById(id);
	        if (existingReport.isPresent()) {
	            report.setId(id);
	            return reportRepository.save(report);
	        }
	        return null;
	    }

	    @Override
	    public void deleteDiagnosticReport(Long id) {
	        reportRepository.deleteById(id);
	    }
}
