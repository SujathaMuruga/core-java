class Gmail {

    String email;
    String name;
    int inboxCount;
    long phone;
    boolean loggedIn;

    public Gmail(String email, String name, int inboxCount, long phone, boolean loggedIn) {
        this.email = email;
        this.name = name;
        this.inboxCount = inboxCount;
        this.phone = phone;
        this.loggedIn = loggedIn;
    }

    public void display() {
        System.out.println(email);
        System.out.println(name);
        System.out.println(inboxCount);
        System.out.println(phone);
        System.out.println(loggedIn);
        System.out.println("-------------------");
    }
}