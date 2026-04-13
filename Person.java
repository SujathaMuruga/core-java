class Person{
public static void main(String[]args){
System.out.println("hi ");
getCat();
System.out.println("hi i have two  2 subject and add");
int chemistry=96;
int maths=84;
String isPassed= "Passed";
toAdd(chemistry,maths,isPassed);
}

static void getCat(){
System.out.println("hello");

}
static void toAdd(int chemistry,int maths,String isPassed){
 System.out.println("ok i will add");
 int marks=chemistry + maths;
 System.out.println(marks);
 System.out.println(isPassed);
}
}