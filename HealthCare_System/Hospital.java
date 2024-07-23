package com.perscholar.HealthCare_System;

public class Hospital <PatientRecord extends Patient>{

    PatientRecord patients ;

    public void addPatient(PatientRecord patient){
        this.patients = patient;
    }
    public PatientRecord getPatient(){
        return this.patients;
    }
}
