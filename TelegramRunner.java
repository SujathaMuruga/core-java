class TelegramRunner {
    public static void main(String[] args) {

        Telegram t1 = new Telegram("varshini","9876543210",20,1001,true);
        t1.display();

        Telegram t2 = new Telegram("gundi","9123456780",15,1002,false);
        t2.display();

        Telegram t3 = new Telegram("anu","9012345678",10,1003,false);
        t3.display();

        Telegram t4 = new Telegram("rahul","9988776655",25,1004,true);
        t4.display();

        Telegram t5 = new Telegram("meena","9090909090",18,1005,false);
        t5.display();

        Telegram t6 = new Telegram("kiran","9345678123",22,1006,true);
        t6.display();

        Telegram t7 = new Telegram("vijay","9786453210",30,1007,true);
        t7.display();
    }
}