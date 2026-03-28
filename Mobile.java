class Mobile {

    public static void main(String[] args) {

        System.out.println("Hello Mobile");
        startMobile();

        System.out.println("Please add two battery levels");

        int levelOne = 40;
        int levelTwo = 60;
        String model = "Android";

        addBattery(levelOne, levelTwo, model);

        System.out.println("What is the mobile price");
		

        double price = getMobilePrice();
        System.out.println(price);
    }

    static void startMobile() {
        System.out.println("Mobile started...");
    }

    static void addBattery(int num1, int num2, String type) {
        System.out.println("Adding battery levels...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getMobilePrice() {
        System.out.println("Checking mobile price...");
        double price = 25000.50;
        System.out.println("Price found");
        return price;
		

		
		
    }
}