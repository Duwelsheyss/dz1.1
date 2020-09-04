package dz3;
import java.lang.*;
public class Book {
    private String autor;
    private String name;
    private int pages;
    public Book(String a, String b, int c){
        autor = a;
        name = b;
        pages = c;
    };
    public Book(String a){
        autor = a;
        name = "none";
        pages = 0;
    };
    public Book(){
        autor = "none";
        name = "none";
        pages = 0;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getAutor(String autor){
        return autor;
    }
    public String getName(String name){
        return name;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return "Autor: " + autor + ", book: " + name +", pages: "+ pages;
    }
}