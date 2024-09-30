package org.example;

import java.util.Scanner;

class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int accidentTotal = scanner.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();
    }
}
