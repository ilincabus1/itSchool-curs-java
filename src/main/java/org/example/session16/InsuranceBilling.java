package org.example.session16;

public class InsuranceBilling implements Billing{
    @Override
    public void generateBill(Patient patient) {
        System.out.println("Here is a bill generated for patient "+patient.getName());
    }
}
