class Bus {

    static String company = "KSRTC";
    static int seats = 50;
    static double ticketPrice = 250;
    static char route = 'M';
    static boolean ac = true;

    public static void main(String[] args) {

        String company = "Private";
        int seats = 40;
        double ticketPrice = 150;
        char route = 'N';
        boolean ac = false;

        System.out.println(Bus.company);
        System.out.println(Bus.seats);
        System.out.println(Bus.ticketPrice);
        System.out.println(Bus.route);
        System.out.println(Bus.ac);

        System.out.println(company);
        System.out.println(seats);
        System.out.println(ticketPrice);
        System.out.println(route);
        System.out.println(ac);
    }
}