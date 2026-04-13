Class BankExam{

static String checkAge(String name,int age){
 String output = "yes this person can write";
 System.out.println("yes i am checking the age");
 if(33<age){
    System.out.println("yes this person can write exam:"+ name);
	return output;
 }
 return "this person can not write exam";
}
}