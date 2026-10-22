package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Setup
        Scanner scanner = new Scanner(System.in);

        // Create the CellPhone object
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        // Prompt for the information needed in cellPhone
        System.out.println("[Enter the information needed for your cell phone]");
        int serialNumber = Integer.parseInt(askQuestion(scanner,"-> What is the serial number?"));

        String model = askQuestion(scanner,"-> What model is the phone?");
        String carrier = askQuestion(scanner,"-> Who is the carrier?");
        String phoneNumber = askQuestion(scanner,"-> What is the phone number?");
        String owner = askQuestion(scanner,"-> Who is the owner of the phone?");

        // Use the setters to set the parameters of the cellPhone object
        cellPhone1.setSerialNumber(serialNumber);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        // Set defaults to the second cellphone (cellPhone2)
        cellPhone2.setSerialNumber(serialNumber);
        cellPhone2.setModel(model);
        cellPhone2.setCarrier(carrier);
        cellPhone2.setPhoneNumber(phoneNumber);
        cellPhone2.setOwner(owner);

        // Display the current values of the cellPhone object
        display(cellPhone1);
        display(cellPhone2);

        // Close the scanner
        scanner.close();
    }

    public static String askQuestion(Scanner scanner, String question) {
        System.out.println(question + ":");
        return scanner.nextLine();
    }

    public static void display(CellPhone cellPhone) {
        System.out.println("\n[Serial Number]: " + cellPhone.getSerialNumber());
        System.out.println("[Model]: " + cellPhone.getModel());
        System.out.println("[Carrier]: " + cellPhone.getCarrier());
        System.out.println("[Phone Number]: " + cellPhone.getPhoneNumber());
        System.out.println("[Owner]: " + cellPhone.getOwner());
    }
}