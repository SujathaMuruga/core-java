class Facebook {

    String name;
    String email;
    int friends;
    long phoneNumber;
    boolean activeStatus;

    public Facebook(String name, String email, int friends, long phoneNumber, boolean activeStatus) {
        this.name = name;
        this.email = email;
        this.friends = friends;
        this.phoneNumber = phoneNumber;
        this.activeStatus = activeStatus;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Friends: " + friends);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Active: " + activeStatus);
        System.out.println("----------------------");
    }
}