class Bike {

    public static void main(String[] args) {

        System.out.println("Hello Bike");
        startBike();

        System.out.println("Please add two mileage values");

        int mileOne = 45;
        int mileTwo = 50;
        String bikeType = "Sports";

        addMileage(mileOne, mileTwo, bikeType);

        System.out.println("What is the bike price");

        double price = getBikePrice();
        System.out.println(price);
    }

    static void startBike() {
        System.out.println("Bike engine started...");
    }

    static void addMileage(int num1, int num2, String type) {
        System.out.println("Adding mileage...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getBikePrice() {
        System.out.println("Checking bike price...");
        double price = 120000.25;
        System.out.println("Price found");
        return price;
    }
}