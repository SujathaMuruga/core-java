class BankAccount {

    public static void main(String[] args) {

        System.out.println("Hello Bank");
        startBank();

        System.out.println("Please add two deposit amounts");

        int deposit1 = 5000;
        int deposit2 = 3000;
        String accountHolder = "Anil";

        addDeposit(deposit1, deposit2, accountHolder);

        System.out.println("What is the bank balance");

        double balance = getBalance();
        System.out.println(balance);
    }

    static void startBank() {
        System.out.println("Bank service started...");
    }

    static void addDeposit(int num1, int num2, String name) {
        System.out.println("Adding deposits...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(name);
    }

    static double getBalance() {
        System.out.println("Checking balance...");
        double price = 15000.00;
        System.out.println("Balance found");
        return price;
    }
}