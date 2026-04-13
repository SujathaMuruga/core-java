class GoogleDrive {
    String username;
	String email;
	String plan;
    int files;
	int folders;
	int storage;
	int shared;

    GoogleDrive(String username, String email, String plan,
                int files, int folders, int storage, int shared) {
        this.username = username;
        this.email = email;
        this.plan = plan;
        this.files = files;
        this.folders = folders;
        this.storage = storage;
        this.shared = shared;
    }
	public void display(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(plan);
		System.out.println(files);
		System.out.println(folders);
		System.out.println(storage);
		System.out.println(shared);
    }
}

