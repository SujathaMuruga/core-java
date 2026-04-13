class Movie {

    static String title = "RRR";
    static int duration = 180;
    static double rating = 8.5;
    static char language = 'T';
    static boolean hit = true;

    public static void main(String[] args) {

        String title = "KGF";
        int duration = 160;
        double rating = 8.0;
        char language = 'K';
        boolean hit = false;

        System.out.println(Movie.title);
        System.out.println(Movie.duration);
        System.out.println(Movie.rating);
        System.out.println(Movie.language);
        System.out.println(Movie.hit);

        System.out.println(title);
        System.out.println(duration);
        System.out.println(rating);
        System.out.println(language);
        System.out.println(hit);
    }
}