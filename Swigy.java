class Swigy {

    String restaurantName;
    String foodItem;
    int price;
    int quantity;
    String deliveryType;

    // Constructor 1 (Basic order)
    public Swigy(String restaurantName, String foodItem) {
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;

        System.out.println("Order from " + restaurantName + ": " + foodItem);
    }

    // Constructor 2 (With price & quantity)
    public Swigy(String restaurantName, String foodItem, int price, int quantity) {
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
        this.price = price;
        this.quantity = quantity;

        System.out.println(foodItem + " costs " + price + " x " + quantity);
    }

    // Constructor 3 (With delivery type)
    public Swigy(String restaurantName, String foodItem, String deliveryType) {
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
        this.deliveryType = deliveryType;

        System.out.println("Delivery Type: " + deliveryType + " for " + foodItem);
    }
}