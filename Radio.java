class Radio {
    static String brand = "Sony";
    static int volume = 10;
    static double price = 2500;
    static char band = 'F';
    static boolean bluetooth = true;

    public static void main(String[] args) {

        String brand = "Philips";
        int volume = 8;
        double price = 2000;
        char band = 'A';
        boolean bluetooth = false;

        System.out.println(Radio.brand);
        System.out.println(Radio.volume);
        System.out.println(Radio.price);
        System.out.println(Radio.band);
        System.out.println(Radio.bluetooth);

        System.out.println(brand);
        System.out.println(volume);
        System.out.println(price);
        System.out.println(band);
        System.out.println(bluetooth);
    }
}