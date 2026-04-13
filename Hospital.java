class Hospital {

    static String name = "City Hospital";
    static int doctors = 50;
    static double fee = 500;
    static char block = 'A';
    static boolean emergency = true;

    public static void main(String[] args) {

        String name = "Metro Hospital";
        int doctors = 30;
        double fee = 300;
        char block = 'B';
        boolean emergency = false;

        System.out.println(Hospital.name);
        System.out.println(Hospital.doctors);
        System.out.println(Hospital.fee);
        System.out.println(Hospital.block);
        System.out.println(Hospital.emergency);

        System.out.println(name);
        System.out.println(doctors);
        System.out.println(fee);
        System.out.println(block);
        System.out.println(emergency);
    }
}