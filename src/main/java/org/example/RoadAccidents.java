package org.example;

interface IRoadAccidents {
    String getAccidentVehicleType();
    String getCity();
    int getAccidentTotal();
}

abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int accidentTotal;

    public RoadAccidents(String vehicleType, String city, int accidentTotal) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    public String getAccidentVehicleType() {
        return vehicleType;
    }

    public String getCity() {
        return city;
    }

    public int getAccidentTotal() {
        return accidentTotal;
    }
}
