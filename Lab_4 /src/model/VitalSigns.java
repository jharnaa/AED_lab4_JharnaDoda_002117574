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
public class VitalSigns {
   
    private double heartRate;
    private double sBloodPressure;
    private double weight;
    private double temp;
    private double dBloodPressure;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    

   

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

 

    public double getWeight() {
        return weight;
    }

    public double getsBloodPressure() {
        return sBloodPressure;
    }

    public void setsBloodPressure(double sBloodPressure) {
        this.sBloodPressure = sBloodPressure;
    }

    public double getdBloodPressure() {
        return dBloodPressure;
    }

    public void setdBloodPressure(double dBloodPressure) {
        this.dBloodPressure = dBloodPressure;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
