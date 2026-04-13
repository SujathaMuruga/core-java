
class RedditRunner {
    public static void main(String[] args) {
        Reddit r1 = new Reddit("u1","u1@mail","tech",10,20,100,50);
		r1.display();
        Reddit r2 = new Reddit("u2","u2@mail","fun",20,30,200,60);
		r2.display();
        Reddit r3 = new Reddit("u3","u3@mail","news",30,40,300,70);
		r3.display();
        Reddit r4 = new Reddit("u4","u4@mail","games",40,50,400,80);
		r4.display();
        Reddit r5 = new Reddit("u5","u5@mail","movies",50,60,500,90);
		r5.display();
        Reddit r6 = new Reddit("u6","u6@mail","music",60,70,600,100);
		r6.display();
        Reddit r7 = new Reddit("u7","u7@mail","sports",70,80,700,110);
		r7.display();
    }
}