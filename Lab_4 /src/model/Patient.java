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
public class Patient {
    
    private Person person;
    private String category;
    private EncounterHistory encounterHist;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public EncounterHistory getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(EncounterHistory encounterHist) {
        this.encounterHist = encounterHist;
    }

    public Patient(Person person) {
        this.person = person;
        this.encounterHist = new EncounterHistory();
        //this.chooseCategory();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
       
    public VitalSigns addNewVitals() {
        Encounter e = this.encounterHist.addNewEncounter();
        return e.getVitals();
    }



    public Boolean isPatientNormal() {
        VitalSigns vitals = this.encounterHist.getEncounterHist().get(this.encounterHist.getEncounterHist().size() - 1).getVitals();
        double sys=vitals.getsBloodPressure();double dia=vitals.getdBloodPressure();
        boolean flag=false;
        
        if(sys>120 ||sys<100 || dia>80||dia<60)
        {
            //System.out.println("does it even reach here");
            flag=false;
        }
        else{
        flag=true;}
        System.out.println(flag);
        return flag;
    }
   
}
