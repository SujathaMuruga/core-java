class Zoom {
    String username;
	String email;
    String meetingId;
    int meetings;
	int participants;
	int duration;
	int recordings;

    Zoom(String username, String email, String meetingId,
         int meetings, int participants, int duration, int recordings) {
        this.username = username;
        this.email = email;
        this.meetingId = meetingId;
        this.meetings = meetings;
        this.participants = participants;
        this.duration = duration;
        this.recordings = recordings;
    }
		public void display(){
		System.out.println(username);
		System.out.println(email);
		System.out.println(meetingId);
		System.out.println(meetings);
		System.out.println(participants);
		System.out.println(duration);
		System.out.println(recordings);
    }
}
