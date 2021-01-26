class Vehicle {
    double lkm;
    double fuelcap;
    int passengers;

    int range() {
        return (int) (fuelcap / lkm * 100);
    }

    double fuelneeded(int km) {
        return (double) (km / 100 * lkm);
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        double liters;
        int distance = 252;

        minivan.passengers = 7;
        minivan.fuelcap = 54;
        minivan.lkm = 8.9;

        sportCar.passengers = 2;
        sportCar.fuelcap = 45;
        sportCar.lkm = 15;

        liters = minivan.fuelneeded(500);
        System.out.println("Minivan needed " + liters + " fuel.");

        liters = sportCar.fuelneeded(500);
        System.out.println("Sportcar needed " + liters + " fuel.");


    }
}