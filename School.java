class School {

    static String name = "Green School";
    static int students = 1000;
    static double fees = 25000;
    static char grade = 'A';
    static boolean transport = true;

    public static void main(String[] args) {

        String name = "Blue School";
        int students = 800;
        double fees = 20000;
        char grade = 'B';
        boolean transport = false;

        System.out.println(School.name);
        System.out.println(School.students);
        System.out.println(School.fees);
        System.out.println(School.grade);
        System.out.println(School.transport);

        System.out.println(name);
        System.out.println(students);
        System.out.println(fees);
        System.out.println(grade);
        System.out.println(transport);
    }
}