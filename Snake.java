class Snake {
    static String species = "Cobra";
    static int length = 5;
    static double weight = 2.5;
    static char venomous = 'Y';
    static boolean hasScales = true;

    public static void main(String[] args) {

        String species = "python";
        int  length= 15;
        double weight = 10.2;
        char venomous = 'N';
        boolean hasScales = true;

        System.out.println(Snake.species);
        System.out.println(Snake.length);
        System.out.println(Snake.weight);
        System.out.println(Snake.venomous);
        System.out.println(Snake.hasScales);

        System.out.println(species);
        System.out.println(length);
        System.out.println(weight);
        System.out.println(venomous);
        System.out.println(hasScales);
    }
}