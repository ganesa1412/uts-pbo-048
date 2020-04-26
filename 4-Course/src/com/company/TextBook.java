package com.company;

public class TextBook {
    String title, author, publisher;

//    Constructor
    public TextBook(String textTitle, String author, String pub){
        this.title = textTitle;
        this.author = author;
        this.publisher = pub;
    }
    public TextBook(TextBook object2){
        this.title = object2.title;
        this.author = object2.author;
        this.publisher = object2.publisher;
    }
//    Methods
    public void set(String textTitle, String auth, String pub){
        this.title = textTitle;
        this.author = auth;
        this.publisher = pub;
    }
    public String toString(){
        String str = "Text Book Title : " + this.title + "\n";
        str += "Author : " + this.author + "\n";
        str += "Publisher : " + this.publisher;
        return str;
    }
}
