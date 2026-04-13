class Telegram {

    String username;
    String phone;
    int groupsJoined;
    long userId;
    boolean premium;

    public Telegram(String username, String phone, int groupsJoined, long userId, boolean premium) {
        this.username = username;
        this.phone = phone;
        this.groupsJoined = groupsJoined;
        this.userId = userId;
        this.premium = premium;
    }

    public void display() {
        System.out.println(username);
        System.out.println(phone);
        System.out.println(groupsJoined);
        System.out.println(userId);
        System.out.println(premium);
        System.out.println("-------------------");
    }
}