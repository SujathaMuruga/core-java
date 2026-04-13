class MyntraRunner {
    public static void main(String[] args) {
        Myntra m1 = new Myntra("Shirt","Fashion","Zara",2000,5,10,100);
		m1.display();
        Myntra m2 = new Myntra("Jeans","Fashion","Levis",3000,4,20,200);
		m2.display();
        Myntra m3 = new Myntra("Shoes","Fashion","Nike",5000,5,15,300);
		m3.display();
        Myntra m4 = new Myntra("Watch","Acc","Fossil",8000,4,5,150);
		m4.display();
        Myntra m5 = new Myntra("Bag","Acc","Skybag",2500,5,25,120);
		m5.display();
        Myntra m6 = new Myntra("Jacket","Fashion","Puma",4000,4,30,180);
		m6.display();
        Myntra m7 = new Myntra("Cap","Acc","Adidas",1000,5,50,90);
		m7.display();
    }
}