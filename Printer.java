class Printer {
    static String brand = "Canon";
    static int speed = 20;
    static double price = 8500;
    static char model = 'A';
    static boolean color = true;

    public static void main(String[] args) {

        String brand = "Epson";
        int speed = 15;
        double price = 6500;
        char model = 'B';
        boolean color = false;

        System.out.println(Printer.brand);
        System.out.println(Printer.speed);
        System.out.println(Printer.price);
        System.out.println(Printer.model);
        System.out.println(Printer.color);

        System.out.println(brand);
        System.out.println(speed);
        System.out.println(price);
        System.out.println(model);
        System.out.println(color);
    }
}