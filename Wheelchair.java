class Wheelchair {

    public static void main(String[] args) {

        System.out.println("Hello Wheelchair");
        startWheelchair();

        System.out.println("Please add two wheel counts");

        int wheelFront = 2;
        int wheelBack = 2;
        String chairType = "Manual";

        addWheels(wheelFront, wheelBack, chairType);

        System.out.println("What is the wheelchair price");

        double price = getWheelchairPrice();
        System.out.println(price);
    }

    static void startWheelchair() {
        System.out.println("Wheelchair service started...");
    }

    static void addWheels(int num1, int num2, String type) {
        System.out.println("Adding wheel numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getWheelchairPrice() {
        System.out.println("Checking wheelchair price...");
        double price = 1200.50;
        System.out.println("Price found");
        return price;
    }
}