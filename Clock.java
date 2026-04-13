class Clock {
    static String brand = "Ajanta";
    static int hours = 12;
    static double price = 999;
    static char shape = 'R';
    static boolean digital = false;

    public static void main(String[] args) {

        String brand = "Titan";
        int hours = 24;
        double price = 1999;
        char shape = 'S';
        boolean digital = true;

        System.out.println(Clock.brand);
        System.out.println(Clock.hours);
        System.out.println(Clock.price);
        System.out.println(Clock.shape);
        System.out.println(Clock.digital);

        System.out.println(brand);
        System.out.println(hours);
        System.out.println(price);
        System.out.println(shape);
        System.out.println(digital);
    }
}