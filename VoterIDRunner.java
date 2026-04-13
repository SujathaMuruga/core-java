class VoterIDRunner {

    public static void main(String[] args) {

        VoterID person1 = new VoterID();
        person1.name = "Rahul Kumar";
        person1.fatherName = "Suresh Kumar";
        person1.voterIdNumber = "KA1234567";
        person1.dob = "12/05/1998";
        person1.gender = "Male";
        person1.address = "BTM Bangalore";
        person1.constituency = "Bangalore South";

        System.out.println("---- VOTER ID 1 ----");
        System.out.println("Name: " + person1.name);
        System.out.println("Father Name: " + person1.fatherName);
        System.out.println("Voter ID: " + person1.voterIdNumber);
        System.out.println("DOB: " + person1.dob);
        System.out.println("Gender: " + person1.gender);
        System.out.println("Address: " + person1.address);
        System.out.println("Constituency: " + person1.constituency);


        VoterID person2 = new VoterID();
        person2.name = "Priya Sharma";
        person2.fatherName = "Ramesh Sharma";
        person2.voterIdNumber = "KA7654321";
        person2.dob = "11/02/2000";
        person2.gender = "Female";
        person2.address = "Whitefield Bangalore";
        person2.constituency = "Bangalore East";

        System.out.println("---- VOTER ID 2 ----");
        System.out.println("Name: " + person2.name);
        System.out.println("Father Name: " + person2.fatherName);
        System.out.println("Voter ID: " + person2.voterIdNumber);
        System.out.println("DOB: " + person2.dob);
        System.out.println("Gender: " + person2.gender);
        System.out.println("Address: " + person2.address);
        System.out.println("Constituency: " + person2.constituency);

    }
}