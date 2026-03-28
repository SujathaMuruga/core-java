class Laptop {

    public static void main(String[] args) {

        System.out.println("Hello Laptop");
        startLaptop();

        System.out.println("Please add two RAM sizes");

        int ramOne = 8;
        int ramTwo = 16;
        String brand = "Dell";

        addRam(ramOne, ramTwo, brand);

        System.out.println("What is the laptop price");

        double price = getLaptopPrice();
        System.out.println(price);
    }

    static void startLaptop() {
        System.out.println("Laptop started...");
    }

    static void addRam(int num1, int num2, String type) {
        System.out.println("Adding RAM values...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getLaptopPrice() {
        System.out.println("Checking laptop price...");
        double price = 65000.75;
        System.out.println("Price found");
        return price;
    }
}