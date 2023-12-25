package main;

public class Movie {
    private String name;
    private String type;
    private String year;
    private String description;
    private String actor;
    private int price;
    
    int id;
    static int cnt=1;
    public Movie(String name, String type, String year, String description, String actor) {
        this.name = name;
        this.type = type;
        this.year = year;
        this.description = description;
        this.actor = actor;
        this.id=cnt++;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    
}
