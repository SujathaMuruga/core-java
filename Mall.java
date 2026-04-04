class Mall{
String name;
int floors;
double rating;

public Mall(){
System.out.println("Welcome to mall");
}
public Mall(String name,int floors,double rating)
{
this.name=name;
this.floors=floors;
this.rating=rating;
}
public void display(){
System.out.println(name);
System.out.println(floors);
System.out.println(rating);
}

}