class Scanner {

    public static void main(String[] args) {

        System.out.println("Hello Scanner");
        startScanner();

        System.out.println("Please add two scan numbers");

        int scanOne = 3;
        int scanTwo = 4;
        String scanType = "MRI";

        addScans(scanOne, scanTwo, scanType);

        System.out.println("What is the scan charge");

        double price = getScanPrice();
        System.out.println(price);
    }

    static void startScanner() {
        System.out.println("Scanner started...");
    }

    static void addScans(int num1, int num2, String type) {
        System.out.println("Adding scan numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getScanPrice() {
        System.out.println("Checking scan price...");
        double price = 3500.00;
        System.out.println("Price found");
        return price;
    }
}