package org.example.session16;

public class HospitalDemo {
    public static void main(String[] args) {
        main.java.org.example.session16.Person staff= new main.java.org.example.session16.Person("StaffName",1);
        main.java.org.example.session16.Person doctor = new main.java.org.example.session16.Doctor("Doc", 2);
        main.java.org.example.session16.Person nurse = new main.java.org.example.session16.Nurse("Nurse", 3);
        main.java.org.example.session16.Patient patient = new main.java.org.example.session16.Patient("Marcel",4,"Flu");
        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        main.java.org.example.session16.InsuranceBilling insuranceBilling= new main.java.org.example.session16.InsuranceBilling();
        insuranceBilling.generateBill(patient);
    }
}
