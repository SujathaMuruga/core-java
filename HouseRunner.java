class HouseRunner {
    public static void main(String[] args) {

        // Object 1
        House h1 = new House();
        h1.ownerName = "kiran";
        h1.color = "White";
        h1.floors = 2;
        h1.price = 5000000;
        h1.phoneNo = 9874563898L;

        // Object 2
        House h2 = new House();
        h2.ownerName = "Sujatha";
        h2.color = "Blue";
        h2.floors = 3;
        h2.price = 7500000;
        h2.phoneNo = 9123456789L;

        // Print Object 1
        System.out.println("House 1 Details:");
        System.out.println(House.country);
        System.out.println(House.type);
        System.out.println(h1.ownerName);
        System.out.println(h1.color);
        System.out.println(h1.floors);
        System.out.println(h1.price);
        System.out.println(h1.phoneNo);

        // Print Object 2
        System.out.println("\nHouse 2 Details:");
        System.out.println(House.country);
        System.out.println(House.type);
        System.out.println(h2.ownerName);
        System.out.println(h2.color);
        System.out.println(h2.floors);
        System.out.println(h2.price);
        System.out.println(h2.phoneNo);

        //  Reinitialization
        h1.ownerName = "Rahul";
        h1.price = 5500000;

        System.out.println("\nAfter Reinitialization of House 1:");
        System.out.println(h1.ownerName);
        System.out.println(h1.price);
    }
}