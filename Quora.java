class Quora {
    String username;
	String email;
	String topic;
    int questions;
	int answers; 
	int followers; 
	int views;

    Quora(String username, String email, String topic,
          int questions, int answers, int followers, int views) {
        this.username = username;
        this.email = email;
        this.topic = topic;
        this.questions = questions;
        this.answers = answers;
        this.followers = followers;
	    this.views = views;
	}
		
	public void display(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(topic);
		System.out.println(questions);
		System.out.println(answers);
		System.out.println(followers);
		System.out.println(views);
	 
    }
}

