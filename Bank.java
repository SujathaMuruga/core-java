class Bank {

    static String name = "SBI";
    static int branches = 20000;
    static double interest = 6.5;
    static char grade = 'A';
    static boolean loanAvailable = true;

    public static void main(String[] args) {

        String name = "HDFC";
        int branches = 5000;
        double interest = 7.2;
        char grade = 'B';
        boolean loanAvailable = false;

        System.out.println(Bank.name);
        System.out.println(Bank.branches);
        System.out.println(Bank.interest);
        System.out.println(Bank.grade);
        System.out.println(Bank.loanAvailable);

        System.out.println(name);
        System.out.println(branches);
        System.out.println(interest);
        System.out.println(grade);
        System.out.println(loanAvailable);
    }
}