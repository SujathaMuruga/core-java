class Bird {
    static String name = "Parrot";
    static int wings = 2;
    static double weight = 1.5;
    static char color = 'G';
    static boolean canFly = true;

    public static void main(String[] args) {

        String name = "Penguin";
        int wings = 2;
        double weight = 5.0;
        char color = 'B';
        boolean canFly = false;

        System.out.println(Bird.name);
        System.out.println(Bird.wings);
        System.out.println(Bird.weight);
        System.out.println(Bird.color);
        System.out.println(Bird.canFly);

        System.out.println(name);
        System.out.println(wings);
        System.out.println(weight);
        System.out.println(color);
        System.out.println(canFly);
    }
}