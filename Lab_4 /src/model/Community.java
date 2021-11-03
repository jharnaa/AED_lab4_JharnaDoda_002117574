/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jharnadoda
 */
public class Community {
    
    private House address;
    private PatientDirectory patient;
    private HashMap<String, ArrayList<Patient>> patientDirect;

    public Community(PatientDirectory patient) {
        this.patient = patient;
        this.patientDirect=new HashMap<>();
    }

    public House getAddress() {
        return address;
    }

    public void setAddress(House address) {
        this.address = address;
    }

    public PatientDirectory getPatient() {
        return patient;
    }

    public void setPatient(PatientDirectory patient) {
        this.patient = patient;
    }

    public HashMap<String, ArrayList<Patient>> getPatientDirect() {
        return patientDirect;
    }

    public void setPatientDirect(HashMap<String, ArrayList<Patient>> patientDirect) {
        this.patientDirect = patientDirect;
    }
    
    public void createCommunity()
    {
        for(String firstName : this.patient.getPatientDetails().keySet())
        {
            String zip = this.patient.getPatientDetails().get(firstName).getPerson().getAddress().getZipcode();
            ArrayList<Patient> commPatient = new ArrayList<>();
            if(this.patientDirect.containsKey(zip))
            {
                ArrayList<Patient> newCommunity = this.patientDirect.get(zip);
                newCommunity.add(this.patient.getPatientDetails().get(firstName));
                this.patientDirect.replace(zip, newCommunity);
            }
            else
            {
                commPatient.add(this.patient.getPatientDetails().get(firstName));
                this.patientDirect.put(zip, commPatient);
            }
        }
    }
}
