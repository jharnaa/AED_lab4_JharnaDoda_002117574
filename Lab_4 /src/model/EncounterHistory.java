/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jharnadoda
 */
public class EncounterHistory {
    private ArrayList<Encounter> encounterHist;

    public ArrayList<Encounter> getEncounterHist() {
        return encounterHist;
    }

    public void setEncounterHist(ArrayList<Encounter> encounterHist) {
        this.encounterHist = encounterHist;
    }
    
    public Encounter addNewEncounter()
    {
        Encounter e = new Encounter();
        this.encounterHist.add(e);
        return e;
    }

    public EncounterHistory() {
        this.encounterHist = new ArrayList<>();
    }
}
