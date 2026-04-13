class Snapchat {
    String userId;
    int streak;
    boolean snapMode;
    char plan;

    public Snapchat(String p1, int p2, boolean p3, char p4) {
        userId = p1;
        streak = p2;
        snapMode = p3;
        plan = p4;
    }

    public void display() {
        System.out.println(userId);
        System.out.println(streak);
        System.out.println(snapMode);
        System.out.println(plan);
    }
}