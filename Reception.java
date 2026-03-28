class Reception {

    public static void main(String[] args) {

        System.out.println("Hello Reception");
        startReception();

        System.out.println("Please add two visitor counts");

        int morningVisitors = 12;
        int eveningVisitors = 8;
        String shiftType = "Morning";

        addVisitors(morningVisitors, eveningVisitors, shiftType);

        System.out.println("What is the reception service charge");

        double charge = getReceptionCharge();
        System.out.println(charge);
    }

    static void startReception() {
        System.out.println("Reception service started...");
    }

    static void addVisitors(int num1, int num2, String type) {
        System.out.println("Adding visitor numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getReceptionCharge() {
        System.out.println("Checking reception charge...");
        double price = 300.50;
        System.out.println("Charge found");
        return price;
    }
}