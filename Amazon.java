class Amazon {

    String customerName;
    String email;
    int orders;
    long phone;
    boolean primeMember;

    public Amazon(String customerName, String email, int orders, long phone, boolean primeMember) {
        this.customerName = customerName;
        this.email = email;
        this.orders = orders;
        this.phone = phone;
        this.primeMember = primeMember;
    }

    public void display() {
        System.out.println(customerName);
        System.out.println(email);
        System.out.println(orders);
        System.out.println(phone);
        System.out.println(primeMember);
        System.out.println("-------------------");
    }
}