class Mask {

    public static void main(String[] args) {

        System.out.println("Hello Mask");
        startMask();

        System.out.println("Please add two mask counts");

        int packOne = 20;
        int packTwo = 30;
        String maskType = "N95";

        addMasks(packOne, packTwo, maskType);

        System.out.println("What is the mask price");

        double price = getMaskPrice();
        System.out.println(price);
    }

    static void startMask() {
        System.out.println("Mask supply started...");
    }

    static void addMasks(int num1, int num2, String type) {
        System.out.println("Adding mask packs...");
        int total = num1 + num2;
        System.out.println(total);
        System.out.println(type);
    }

    static double getMaskPrice() {
        System.out.println("Checking mask price...");
        double price = 50.25;
        System.out.println("Price found");
        return price;
    }
}