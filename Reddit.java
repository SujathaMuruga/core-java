class Reddit {
    String username;
	String email;
	String subreddit;
    int posts;
	double comments;
	int karma;
	int followers;

    Reddit(String username, String email, String subreddit,
           int posts, int comments, int karma, int followers) {
        this.username = username;
        this.email = email;
        this.subreddit = subreddit;
        this.posts = posts;
        this.comments = comments;
        this.karma = karma;
        this.followers = followers;
    }
	public void display(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(subreddit);
		System.out.println(posts);
		System.out.println(comments);
		System.out.println(karma);
		System.out.println(followers);
    }
	}