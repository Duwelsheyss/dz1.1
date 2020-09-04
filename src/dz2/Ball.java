package dz2;
import java.lang.*;
public class Ball {
    private String firm;
    private String color;
    public Ball(String a, String b){
        firm = a;
        color = b;
    };
    public Ball(String a){
        firm = a;
        color = "none";
    };
    public Ball(){
        firm = "none";
        color = "none";
    }
    public void setFirm(String firm) {
        this.firm = firm;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getFirm(String firm){
        return firm;
    }
    public String getColor(String color){
        return color;
    }
    public String toString(){
        return "Firm: " + firm + " color: " + color;
    }
}
