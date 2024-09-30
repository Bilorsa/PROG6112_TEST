package org.example;

class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
    }
}
