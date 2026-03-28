class SwiggyOrder {

    public static void main(String[] args) {

        System.out.println("Hello Swiggy");
        startOrder();

        System.out.println("Please add two food item prices");

        int burger = 150;
        int pizza = 250;
        String restaurant = "Pizza Shop";

        addItems(burger, pizza, restaurant);

        System.out.println("What is the delivery charge");

        double charge = getDeliveryCharge();
        System.out.println(charge);
    }

    static void startOrder() {
        System.out.println("Food order started...");
    }

    static void addItems(int price1, int price2, String shop) {
        System.out.println("Calculating food price...");
        int total = price1 + price2;
        System.out.println(total);
        System.out.println(shop);
    }

    static double getDeliveryCharge() {
        System.out.println("Checking delivery charge...");
        double price = 40.25;
        System.out.println("Charge found");
        return price;
    }
}