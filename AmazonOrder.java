class AmazonOrder {

    public static void main(String[] args) {

        System.out.println("Hello Amazon");
        startOrder();

        System.out.println("Please add two product prices");

        int mobile = 15000;
        int charger = 800;
        String category = "Electronics";

        addProducts(mobile, charger, category);

        System.out.println("What is the shipping charge");

        double charge = getShippingCharge();
        System.out.println(charge);
    }

    static void startOrder() {
        System.out.println("Amazon order started...");
    }

    static void addProducts(int p1, int p2, String type) {
        System.out.println("Adding product prices...");
        int total = p1 + p2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getShippingCharge() {
        System.out.println("Checking shipping charge...");
        double price = 120.50;
        System.out.println("Charge found");
        return price;
    }
}