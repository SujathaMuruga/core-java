class Discord {
    String username;
	String email;
	String status;
    int servers;
	int friends;
	int messages;
	int calls;

    Discord(String username, String email, String status,
            int servers, int friends, int messages, int calls) {
        this.username = username;
        this.email = email;
        this.status = status;
        this.servers = servers;
        this.friends = friends;
        this.messages = messages;
        this.calls = calls;
    }
	public void display(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(status);
		System.out.println(servers);
		System.out.println(friends);
		System.out.println(messages);
		System.out.println(calls);
    }
}