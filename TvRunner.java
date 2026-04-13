class TvRunner {
    public static void main(String[] args) {

        // Object 1
        Tv tv1 = new Tv();
        tv1.tvName = "Bravia";
        tv1.ownerName = "Kushal";
        tv1.email = "kushal@gmail.com";
        tv1.phoneNo = 9874563898L;
        tv1.model = "X90J";
        tv1.password = "kushal@123";

        System.out.println("tv1 Company Name: " + Tv.companyName);
        System.out.println("tv1 TV Name: " + tv1.tvName);
        System.out.println("tv1 Owner Name: " + tv1.ownerName);

        // Object 2
        Tv tv2 = new Tv();
        tv2.tvName = "Samsung Smart TV";
        tv2.ownerName = "Mohammed";
        tv2.email = "mohammed@gmail.com";
        tv2.phoneNo = 874512369L;
        tv2.model = "QLED";
        tv2.password = "mohammed@123";

        System.out.println("tv2 Company Name: " + Tv.companyName);
        System.out.println("tv2 TV Name: " + tv2.tvName);
        System.out.println("tv2 Owner Name: " + tv2.ownerName);

        // Object 3 (Reinitialization)
        Tv tv3 = new Tv();
        tv3.tvName = "LG OLED";
        tv3.ownerName = "Revanth";
        tv3.ownerName = "Revanth_King"; // reinitialized

        System.out.println("tv3 Company Name: " + Tv.companyName);
        System.out.println("tv3 TV Name: " + tv3.tvName);
        System.out.println("tv3 Owner Name: " + tv3.ownerName);

        // Object 4 (Partial initialization)
        Tv tv4 = new Tv();
        tv4.ownerName = "Srinivas";
        tv4.tvName = "Mi TV";

        System.out.println("tv4 Company Name: " + Tv.companyName);
        System.out.println("tv4 TV Name: " + tv4.tvName);
        System.out.println("tv4 Owner Name: " + tv4.ownerName);
    }
}
