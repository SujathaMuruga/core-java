class QuoraRunner {
    public static void main(String[] args) {
        Quora obj1 = new Quora("u1","u1@mail","tech",5,10,50,1000);
		obj1.display();
        Quora obj2 = new Quora("u2","u2@mail","health",6,20,60,2000);
		obj2.display();
        Quora obj3 = new Quora("u3","u3@mail","edu",7,30,70,3000);
		obj3.display();
        Quora obj4 = new Quora("u4","u4@mail","food",8,40,80,4000);
		obj4.display();
        Quora obj5 = new Quora("u5","u5@mail","travel",9,50,90,5000);
		obj5.display();
        Quora obj6 = new Quora("u6","u6@mail","science",10,60,100,6000);
		obj6.display();
        Quora obj7 = new Quora("u7","u7@mail","sports",11,70,110,7000);
		obj7.display();
    }
}