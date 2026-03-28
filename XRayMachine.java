class XRayMachine {

    public static void main(String[] args) {

        System.out.println("Hello XRayMachine");
        startXRay();

        System.out.println("Please add two x-ray counts");

        int scanOne = 4;
        int scanTwo = 5;
        String scanType = "Chest";

        addScans(scanOne, scanTwo, scanType);

        System.out.println("What is the x-ray charge");

        double charge = getXRayCharge();
        System.out.println(charge);
    }

    static void startXRay() {
        System.out.println("X-ray scanning started...");
    }

    static void addScans(int num1, int num2, String type) {
        System.out.println("Adding scan numbers...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getXRayCharge() {
        System.out.println("Checking x-ray charge...");
        double price = 800.25;
        System.out.println("Charge found");
        return price;
    }
}