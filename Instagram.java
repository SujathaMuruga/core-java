class Instagram {

    String username;
    String email;
    int followers;
    long phoneNumber;
    boolean verified;

    public Instagram(String username, String email, int followers, long phoneNumber, boolean verified) {
        this.username = username;
        this.email = email;
        this.followers = followers;
        this.phoneNumber = phoneNumber;
        this.verified = verified;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Followers: " + followers);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Verified: " + verified);
        System.out.println("----------------------");
    }
}