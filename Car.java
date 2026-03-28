class Car {

    public static void main(String[] args) {

        System.out.println("Hello Car");
        startCar();

        System.out.println("Please add two speed values");

        int speedOne = 60;
        int speedTwo = 40;
        String carType = "SUV";

        addSpeed(speedOne, speedTwo, carType);

        System.out.println("What is the car price");

        double price = getCarPrice();
        System.out.println(price);
    }

    static void startCar() {
        System.out.println("Car engine started...");
    }

    static void addSpeed(int num1, int num2, String type) {
        System.out.println("Adding speed values...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getCarPrice() {
        System.out.println("Checking car price...");
        double price = 850000.50;
        System.out.println("Price found");
        return price;
    }
}