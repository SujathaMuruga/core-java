class ATMWithdraw {

    public static void main(String[] args) {

        System.out.println("Hello ATM");
        startATM();

        System.out.println("Please add two withdrawal amounts");

        int withdrawOne = 2000;
        int withdrawTwo = 1000;
        String accountType = "Savings";

        addWithdraw(withdrawOne, withdrawTwo, accountType);

        System.out.println("What is the ATM fee");

        double fee = getATMFee();
        System.out.println(fee);
    }

    static void startATM() {
        System.out.println("ATM transaction started...");
    }

    static void addWithdraw(int w1, int w2, String type) {
        System.out.println("Calculating withdrawal...");
        int total = w1 + w2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getATMFee() {
        System.out.println("Checking ATM fee...");
        double price = 23.50;
        System.out.println("Fee found");
        return price;
    }
}