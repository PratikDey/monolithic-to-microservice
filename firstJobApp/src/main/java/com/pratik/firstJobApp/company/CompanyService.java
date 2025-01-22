package com.pratik.firstJobApp.company;



import com.pratik.firstJobApp.job.Job;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    void createCompany(Company company);
    boolean updateCompany(Company updatedCompany, Long id);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
