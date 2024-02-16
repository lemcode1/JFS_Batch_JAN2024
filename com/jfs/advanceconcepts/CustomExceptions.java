package com.jfs.advanceconcepts;


import com.jfs.advanceconcepts.exceptions.PatientNotFoundException;
import com.jfs.advanceconcepts.exceptions.UnimplementedException;

class Patient {
    String patientId;
    String name;

    public int getPatientInfo(String patientId) {
        // logic to connect to database and get the patient
        Patient patient = null;
        if (patient == null) {
            throw new PatientNotFoundException("Patient is not found in the database, please give valid patient id");
        }
        return 0;
    }

    public void updatePatient(){

    }

    public void deletePatient() throws UnimplementedException {

        throw new UnimplementedException("Delete functionality is not available for now, we will soon implement it");
    }
    public void addPatient() {
    }
}
public class CustomExceptions {
    public static void main(String[] args){
        try {
            Patient patient = new Patient();
            int patientId = patient.getPatientInfo("123");  // 2sec
            patient.deletePatient();  // 2sec
        } catch (PatientNotFoundException pe) {
            System.out.println(pe.getMessage());
        } catch (UnimplementedException e) {
            throw new RuntimeException(e);
        }
    }
}
