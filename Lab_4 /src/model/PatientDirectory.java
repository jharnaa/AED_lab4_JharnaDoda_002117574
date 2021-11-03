/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author jharnadoda
 */
public class PatientDirectory {
 private HashMap<String, Patient> patientDetails;

    public HashMap<String, Patient> getPatientDetails() {
        return patientDetails;
    }

    public void setPatientDetails(HashMap<String, Patient> patientDetails) {
        this.patientDetails = patientDetails;
    }

    public PatientDirectory() {
        this.patientDetails = new HashMap<>();
    }
    
    public Patient addNewPatient(Person person)
    {
        Patient p = new Patient(person);
        this.patientDetails.put(person.getFirstName(), p);
        return p;
    }   

}
