class Stethoscope {

    public static void main(String[] args) {

        System.out.println("Hello Stethoscope");
        startStethoscope();

        System.out.println("Please add two sound levels");

        int levelOne = 5;
        int levelTwo = 3;
        String checkType = "Heartbeat";

        addLevels(levelOne, levelTwo, checkType);

        System.out.println("What is the stethoscope price");

        double price = getStethoscopePrice();
        System.out.println(price);
    }

    static void startStethoscope() {
        System.out.println("Stethoscope checking started...");
    }

    static void addLevels(int num1, int num2, String type) {
        System.out.println("Adding sound levels...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getStethoscopePrice() {
        System.out.println("Checking stethoscope price...");
        double price = 350.75;
        System.out.println("Price found");
        return price;
    }
}