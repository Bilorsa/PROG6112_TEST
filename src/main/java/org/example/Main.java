package org.example;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define cities and accident counters
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[][] accidents = new int[cities.length][2]; // Two-dimentional array

        // Input accidents for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter accidents for " + cities[i] + ":");
            System.out.print("Car accidents: ");
            accidents[i][0] = scanner.nextInt();
            System.out.print("Motorbike accidents: ");
            accidents[i][1] = scanner.nextInt();
        }

        // Calculate total accidents
        int[] totalAccidents = new int[2]; // 2 columns: car, motorbike
        for (int i = 0; i < cities.length; i++) {
            totalAccidents[0] += accidents[i][0];
            totalAccidents[1] += accidents[i][1];
        }

        // Printing report
        System.out.println("\nRoad Accident Report");
        System.out.println("------------------");
        System.out.println("City\tCar\tMotorbike");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + "\t" + accidents[i][0] + "\t" + accidents[i][1]);
        }
        System.out.println("\nTotal Accidents:");
        System.out.println("Car: " + totalAccidents[0]);
        System.out.println("Motorbike: " + totalAccidents[1]);
    }
}