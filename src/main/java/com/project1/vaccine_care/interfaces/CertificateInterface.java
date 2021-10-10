/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project1.vaccine_care.interfaces;

import com.project1.vaccine_care.models.Certificate;
import com.project1.vaccine_care.models.Employee;
import java.util.List;

/**
 *
 * @author user
 */
public interface CertificateInterface {
    List<Certificate> getAll();
    void store(Certificate certificate);
    Certificate getById(long id);
    void delete(long id);  
    List<Certificate> getCertificate();
}
