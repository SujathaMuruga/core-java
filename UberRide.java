class UberRide {

    public static void main(String[] args) {

        System.out.println("Hello Uber Ride");
        startRide();

        System.out.println("Please add two ride distances");

        int tripOne = 12;
        int tripTwo = 8;
        String rideType = "Mini";

        addDistance(tripOne, tripTwo, rideType);

        System.out.println("What is the ride fare");

        double fare = getRideFare();
        System.out.println(fare);
    }

    static void startRide() {
        System.out.println("Uber ride started...");
    }

    static void addDistance(int km1, int km2, String type) {
        System.out.println("Calculating distance...");
        int total = km1 + km2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getRideFare() {
        System.out.println("Checking ride fare...");
        double price = 320.50;
        System.out.println("Fare found");
        return price;
    }
}