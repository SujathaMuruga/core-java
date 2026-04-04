class BottleRunner{
public static void main(String[]args){
Bottle.getBottleName();
Bottle.getType("Steel");
int price = Bottle.getPrice();
System.out.println(price);
int cap=Bottle.getCapacity(1,2);
System.out.println(cap);
}
}