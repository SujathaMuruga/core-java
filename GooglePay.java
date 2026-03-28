class GooglePay {

    public static void main(String[] args) {

        System.out.println("Hello Google Pay");
        startPayment();

        System.out.println("Please add two transfer amounts");

        int amountOne = 500;
        int amountTwo = 300;
        String receiver = "Ravi";

        addMoney(amountOne, amountTwo, receiver);

        System.out.println("What is the transaction fee");

        double fee = getTransactionFee();
        System.out.println(fee);
    }

    static void startPayment() {
        System.out.println("Payment started...");
    }

    static void addMoney(int a1, int a2, String name) {
        System.out.println("Calculating total transfer...");
        int total = a1 + a2;
        System.out.println(total);
        System.out.println(name);
    }

    static double getTransactionFee() {
        System.out.println("Checking transaction fee...");
        double price = 5.50;
        System.out.println("Fee found");
        return price;
    }
}