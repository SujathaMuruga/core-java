class Bed {

    public static void main(String[] args) {

        System.out.println("Hello Bed");
        startBed();

        System.out.println("Please add two ward numbers");

        int wardA = 10;
        int wardB = 15;
        String bedType = "ICU";

        addBeds(wardA, wardB, bedType);

        System.out.println("What is the bed price");

        double price = getBedPrice();
        System.out.println(price);
    }

    static void startBed() {
        System.out.println("Bed service started...");
    }

    static void addBeds(int num1, int num2, String type) {
        System.out.println("Adding bed numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getBedPrice() {
        System.out.println("Checking bed price...");
        double price = 900.50;
        System.out.println("Price found");
        return price;
    }
}