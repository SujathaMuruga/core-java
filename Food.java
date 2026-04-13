class Food {
    static String name = "Biryani";
    static int calories = 500;
    static double price = 180;
    static char size = 'M';
    static boolean spicy = true;

    public static void main(String[] args) {

        String name = "Dosa";
        int calories = 300;
        double price = 80;
        char size = 'L';
        boolean spicy = false;

        System.out.println(Food.name);
        System.out.println(Food.calories);
        System.out.println(Food.price);
        System.out.println(Food.size);
        System.out.println(Food.spicy);

        System.out.println(name);
        System.out.println(calories);
        System.out.println(price);
        System.out.println(size);
        System.out.println(spicy);
    }
}