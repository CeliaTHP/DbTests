package fr.ay.jsontest;

public class MovieInfo {

    private String title;
    private String genre;
    private String syn;
    private String date;

    public MovieInfo(String title, String genre, String syn,String date) {

        this.title = title;
        this.genre = genre;
        this.syn = syn;
        this.date = date;

    }

    public String getTitle() {return title; }
    public String getGenre() {return genre; }
    public String getSyn() {return syn; }
    public String getDate() {return date;}

}
