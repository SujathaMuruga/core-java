class Medicine {

    public static void main(String[] args) {

        System.out.println("Hello Medicine");
        startMedicine();

        System.out.println("Please add two tablet counts");

        int tabletsMorning = 5;
        int tabletsNight = 3;
        String medicineName = "Paracetamol";

        addTablets(tabletsMorning, tabletsNight, medicineName);

        System.out.println("What is the medicine price");

        double price = getMedicinePrice();
        System.out.println(price);
    }

    static void startMedicine() {
        System.out.println("Medicine service started...");
    }

    static void addTablets(int num1, int num2, String name) {
        System.out.println("Adding tablets...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(name);
    }

    static double getMedicinePrice() {
        System.out.println("Checking medicine price...");
        double price = 75.50;
        System.out.println("Price found");
        return price;
    }
}