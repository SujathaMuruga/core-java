class Mouse {
    static String brand = "Dell";
    static int buttons = 3;
    static double price = 599.99;
    static char type = 'W';
    static boolean wireless = true;

    public static void main(String[] args) {

        String brand = "HP";
        int buttons = 2;
        double price = 399.99;
        char type = 'U';
        boolean wireless = false;

        System.out.println(Mouse.brand);
        System.out.println(Mouse.buttons);
        System.out.println(Mouse.price);
        System.out.println(Mouse.type);
        System.out.println(Mouse.wireless);

        System.out.println(brand);
        System.out.println(buttons);
        System.out.println(price);
        System.out.println(type);
        System.out.println(wireless);
    }
}