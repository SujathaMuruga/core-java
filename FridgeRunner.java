class FridgeRunner {
    public static void main(String[] args) {

        // Object 1
        Fridge f1 = new Fridge();
        f1.ownerName = "Kushal";
        f1.color = "Silver";
        f1.capacity = 260;
        f1.price = 25000;
        f1.phoneNo = 9874563898L;

        // Object 2
        Fridge f2 = new Fridge();
        f2.ownerName = "Sneha";
        f2.color = "Black";
        f2.capacity = 300;
        f2.price = 30000;
        f2.phoneNo = 9123456789L;

        // Print Object 1
        System.out.println("Fridge 1 Details:");
        System.out.println(Fridge.brand);
        System.out.println(Fridge.type);
        System.out.println(f1.ownerName);
        System.out.println(f1.color);
        System.out.println(f1.capacity);
        System.out.println(f1.price);
        System.out.println(f1.phoneNo);

        // Print Object 2
        System.out.println("\nFridge 2 Details:");
        System.out.println(Fridge.brand);
        System.out.println(Fridge.type);
        System.out.println(f2.ownerName);
        System.out.println(f2.color);
        System.out.println(f2.capacity);
        System.out.println(f2.price);
        System.out.println(f2.phoneNo);

        //  Reinitialization
        f1.ownerName = "Rahul";
        f1.price = 27000;

        System.out.println("\nAfter Reinitialization of Fridge 1:");
        System.out.println(f1.ownerName);
        System.out.println(f1.price);
    }
}