class AmazonRunner {
    public static void main(String[] args) {

        Amazon a1 = new Amazon("Varshini","var@gmail.com",10,9876543210L,true);
        a1.display();

        Amazon a2 = new Amazon("Gundi","gundi@gmail.com",5,9123456780L,false);
        a2.display();

        Amazon a3 = new Amazon("Anu","anu@gmail.com",7,9012345678L,true);
        a3.display();

        Amazon a4 = new Amazon("Rahul","rahul@gmail.com",12,9988776655L,true);
        a4.display();

        Amazon a5 = new Amazon("Meena","meena@gmail.com",6,9090909090L,false);
        a5.display();

        Amazon a6 = new Amazon("Kiran","kiran@gmail.com",15,9345678123L,true);
        a6.display();

        Amazon a7 = new Amazon("Vijay","vijay@gmail.com",20,9786453210L,true);
        a7.display();
    }
}