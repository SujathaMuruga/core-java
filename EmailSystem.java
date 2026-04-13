class EmailSystem {

    String sender;
    String receiver;
    String subject;
    int attachmentSize;
    String label;

    // Constructor 1 (Basic Email)
    public EmailSystem(String sender, String receiver) {
        this.sender = sender;
        this.receiver = receiver;

        System.out.println("Email sent from " + sender + " to " + receiver);
    }

    // Constructor 2 (Email with Subject & Attachment)
    public EmailSystem(String sender, String receiver, String subject, int attachmentSize) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        this.attachmentSize = attachmentSize;

        System.out.println(sender + " sent an email with subject: " + subject);
    }

    // Constructor 3 (Email with Label)
    public EmailSystem(String sender, String receiver, String label) {
        this.sender = sender;
        this.receiver = receiver;
        this.label = label;

        System.out.println("Important Email: " + sender + " marked as " + label);
    }
}