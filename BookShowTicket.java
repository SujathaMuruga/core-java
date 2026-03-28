class BookMyShowTicket {

    public static void main(String[] args) {

        System.out.println("Hello BookMyShow");
        startBooking();

        System.out.println("Please add two ticket prices");

        int ticketOne = 200;
        int ticketTwo = 200;
        String movie = "Action Movie";

        addTickets(ticketOne, ticketTwo, movie);

        System.out.println("What is the booking fee");

        double fee = getBookingFee();
        System.out.println(fee);
    }

    static void startBooking() {
        System.out.println("Ticket booking started...");
    }

    static void addTickets(int t1, int t2, String name) {
        System.out.println("Adding ticket prices...");
        int total = t1 + t2;
        System.out.println(total);
        System.out.println(name);
    }

    static double getBookingFee() {
        System.out.println("Checking booking fee...");
        double price = 30.00;
        System.out.println("Fee found");
        return price;
    }
}