package main;

public class ShowTimes {
    Movie m;
    int size;
    boolean[] chair = new boolean[60];
    public ShowTimes(Movie m) {
        this.m = m;
        for(int i=0;i<60;i++){
            chair[i]=true;
        }
    }
    public Movie getM() {
        return m;
    }
    public void setM(Movie m) {
        this.m = m;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    
}
