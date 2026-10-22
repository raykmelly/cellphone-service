package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Setup
        Scanner scanner = new Scanner(System.in);

        // Create the CellPhone object
        CellPhone cellPhone = new CellPhone();

        // Prompt for the information needed in cellPhone
        System.out.println("[Enter the information needed for your cell phone]");
        System.out.println("-> What is the serial number?:");
        int serialNumber = scanner.nextInt();

        // Fix the scanner
        scanner.nextLine();

        System.out.println("-> What model is the phone?:");
        String model = scanner.nextLine();
        System.out.println("-> Who is the carrier?:");
        String carrier = scanner.nextLine();
        System.out.println("-> What is the phone number?:");
        String phoneNumber = scanner.nextLine();
        System.out.println("-> Who is the owner of the phone?:");
        String owner = scanner.nextLine();

        // Use the setters to set the parameters of the cellPhone object
        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        // Print out the current values of the cellPhone object
        System.out.println("\n[Serial Number]: " + cellPhone.getSerialNumber());
        System.out.println("[Model]: " + cellPhone.getModel());
        System.out.println("[Carrier]: " + cellPhone.getCarrier());
        System.out.println("[Phone Number]: " + cellPhone.getPhoneNumber());
        System.out.println("[Owner]: " + cellPhone.getOwner());

        // Close the scanner
        scanner.close();
    }
}