package org.example.session16;

public class HospitalDemo {
    public static void main(String[] args) {
        Person staff= new Person("StaffName","1");
        Person doctor = new Doctor("Doc", "2");
        Person nurse = new Nurse("Nurse", "3");
        Patient patient = new Patient("Marcel","4","Flu");
        staff.performDuties();
        doctor.performDuties();
        nurse.performDuties();
        org.example.session16.InsuranceBilling insuranceBilling= new org.example.session16.InsuranceBilling();
        insuranceBilling.generateBill(patient);
    }
}
