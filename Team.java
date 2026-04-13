class Team {
    static String name = "India";
    static int players = 11;
    static double ranking = 1;
    static char group = 'A';
    static boolean qualified = true;

    public static void main(String[] args) {

        String name = "Australia";
        int players = 15;
        double ranking = 2;
        char group = 'B';
        boolean qualified = false;

        System.out.println(Team.name);
        System.out.println(Team.players);
        System.out.println(Team.ranking);
        System.out.println(Team.group);
        System.out.println(Team.qualified);

        System.out.println(name);
        System.out.println(players);
        System.out.println(ranking);
        System.out.println(group);
        System.out.println(qualified);
    }
}