package br.com.alura.api.languages;

public class Language {
    private String title;
    private String image;
    private int ranking;
    
    public Language(String title, String image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public int getRanking() {
        return ranking;
    }   

}
