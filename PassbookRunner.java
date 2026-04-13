class PassbookRunner {

    public static void main(String[] args) {

        Passbook person1 = new Passbook();
        person1.bankName = "SBI";
        person1.accountHolderName = "Rahul Kumar";
        person1.accountNumber = "12345678901";
        person1.ifscCode = "SBIN0001234";
        person1.branchName = "BTM Branch";
        person1.phoneNumber = "9876543210";
        person1.address = "BTM Bangalore";

        System.out.println("---- PASSBOOK 1 ----");
        System.out.println("Bank Name: " + person1.bankName);
        System.out.println("Account Holder: " + person1.accountHolderName);
        System.out.println("Account Number: " + person1.accountNumber);
        System.out.println("IFSC: " + person1.ifscCode);
        System.out.println("Branch: " + person1.branchName);
        System.out.println("Phone: " + person1.phoneNumber);
        System.out.println("Address: " + person1.address);

    }
}