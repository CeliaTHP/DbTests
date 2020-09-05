package fr.ay.jsontest;

public class MovieInfo {

    private String title;
    private String syn;
    private String date;

    public MovieInfo(String title, String syn,String date) {

        this.title = title;
        this.syn = syn;
        this.date = date;

    }

    public String getTitle() {return title; }
    public String getSyn() {return syn; }
    public String getDate() {return date;}

}
