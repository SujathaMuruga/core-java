class Shop {

    static String name = "SuperMart";
    static int items = 500;
    static double revenue = 100000;
    static char section = 'F';
    static boolean open = true;

    public static void main(String[] args) {

        String name = "MiniMart";
        int items = 200;
        double revenue = 50000;
        char section = 'G';
        boolean open = false;

        System.out.println(Shop.name);
        System.out.println(Shop.items);
        System.out.println(Shop.revenue);
        System.out.println(Shop.section);
        System.out.println(Shop.open);

        System.out.println(name);
        System.out.println(items);
        System.out.println(revenue);
        System.out.println(section);
        System.out.println(open);
    }
}