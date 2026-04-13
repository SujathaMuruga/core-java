class Mobile_Detaile {

    String brand;
    String model;
    int price;
    int ram;
    String color;

    // Constructor 1 (Basic details)
    public Mobile_Detaile(String brand, String model) {
        this.brand = brand;
        this.model = model;

        System.out.println("Mobile: " + brand + " " + model);
    }

    // Constructor 2 (With price & RAM)
    public Mobile_Detaile(String brand, String model, int price, int ram) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;

        System.out.println(brand + " " + model + " costs " + price + " with " + ram + "GB RAM");
    }

    // Constructor 3 (With color)
    public Mobile_Detaile(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;

        System.out.println("New " + brand + " " + model + " available in " + color + " color");
    }
}