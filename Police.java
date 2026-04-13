class Police {
    static String station = "Central";
    static int officers = 50;
    static double budget = 500000;
    static char zone = 'N';
    static boolean active = true;

    public static void main(String[] args) {

        String station = "South";
        int officers = 40;
        double budget = 400000;
        char zone = 'S';
        boolean active = false;

        System.out.println(Police.station);
        System.out.println(Police.officers);
        System.out.println(Police.budget);
        System.out.println(Police.zone);
        System.out.println(Police.active);

        System.out.println(station);
        System.out.println(officers);
        System.out.println(budget);
        System.out.println(zone);
        System.out.println(active);
    }
}