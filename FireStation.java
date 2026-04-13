class FireStation {
    static String location = "City Center";
    static int trucks = 5;
    static double fund = 200000;
    static char area = 'E';
    static boolean emergency = true;

    public static void main(String[] args) {

        String location = "Town";
        int trucks = 3;
        double fund = 150000;
        char area = 'W';
        boolean emergency = false;

        System.out.println(FireStation.location);
        System.out.println(FireStation.trucks);
        System.out.println(FireStation.fund);
        System.out.println(FireStation.area);
        System.out.println(FireStation.emergency);

        System.out.println(location);
        System.out.println(trucks);
        System.out.println(fund);
        System.out.println(area);
        System.out.println(emergency);
    }
}