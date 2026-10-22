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
        int serialNumber = Integer.parseInt(askQuestion(scanner,"-> What is the serial number?"));

        String model = askQuestion(scanner,"-> What model is the phone?");
        String carrier = askQuestion(scanner,"-> Who is the carrier?");
        String phoneNumber = askQuestion(scanner,"-> What is the phone number?");
        String owner = askQuestion(scanner,"-> Who is the owner of the phone?");

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

    public static String askQuestion(Scanner scanner, String question) {
        System.out.println(question + ":");
        return scanner.nextLine();
    }
}