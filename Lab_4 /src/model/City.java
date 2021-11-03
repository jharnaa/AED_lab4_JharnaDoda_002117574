/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jharnadoda
 */
public class City {
    
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public City(PatientDirectory patientDirectory) {
        this.community = new Community(patientDirectory);
    }
    
    
}
