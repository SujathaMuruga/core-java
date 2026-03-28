class RailwayTicket {

    public static void main(String[] args) {

        System.out.println("Hello Railway Ticket");
        startBooking();

        System.out.println("Please add two ticket fares");

        int sleeper = 450;
        int ac = 1200;
        String trainName = "Express";

        addFare(sleeper, ac, trainName);

        System.out.println("What is the reservation charge");

        double charge = getReservationCharge();
        System.out.println(charge);
    }

    static void startBooking() {
        System.out.println("Railway booking started...");
    }

    static void addFare(int f1, int f2, String train) {
        System.out.println("Adding ticket fares...");
        int total = f1 + f2;
        System.out.println(total);
        System.out.println(train);
    }

    static double getReservationCharge() {
        System.out.println("Checking reservation charge...");
        double price = 50.75;
        System.out.println("Charge found");
        return price;
    }
}