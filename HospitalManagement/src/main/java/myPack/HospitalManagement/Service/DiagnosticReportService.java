package myPack.HospitalManagement.Service;

import java.util.List;

import myPack.HospitalManagement.Entity.DiagnosticReport;

public interface DiagnosticReportService
{
	 List<DiagnosticReport> getAllDiagnosticReports();
	    
	    DiagnosticReport getDiagnosticReportById(Long id);
	    
	    DiagnosticReport saveDiagnosticReport(DiagnosticReport report);
	    
	    DiagnosticReport updateDiagnosticReport(Long id, DiagnosticReport report);
	    
	    void deleteDiagnosticReport(Long id);
}
