class GmailRunner {
    public static void main(String[] args) {

        Gmail g1 = new Gmail("var@gmail.com","Varshini",50,9876543210L,true);
        g1.display();

        Gmail g2 = new Gmail("gundi@gmail.com","Gundi",30,9123456780L,false);
        g2.display();

        Gmail g3 = new Gmail("anu@gmail.com","Anu",20,9012345678L,true);
        g3.display();

        Gmail g4 = new Gmail("rahul@gmail.com","Rahul",70,9988776655L,true);
        g4.display();

        Gmail g5 = new Gmail("meena@gmail.com","Meena",40,9090909090L,false);
        g5.display();

        Gmail g6 = new Gmail("kiran@gmail.com","Kiran",60,9345678123L,true);
        g6.display();

        Gmail g7 = new Gmail("vijay@gmail.com","Vijay",90,9786453210L,true);
        g7.display();
    }
}