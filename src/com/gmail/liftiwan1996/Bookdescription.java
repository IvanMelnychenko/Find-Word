package com.gmail.liftiwan1996;

public class Bookdescription extends Title {
    private String author;
    private String title;
    private String publisher;
    private String annotation;
    private String text;

    public Bookdescription() {
    }

    public Bookdescription(String title, String text) {
        this.title = title;
        this.text = text;
    }


    public Bookdescription(String author, String title, String publisher, String annotation, String text) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.annotation = annotation;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int findStr(String input1, String input2, String search) {
        return super.findStr(input1, input2, search);
    }

    @Override
    public String toString() {
        return "Bookdescription contain your world" + findStr(new Bookdescription().getTitle(), new Bookdescription().getText(), keyword);
    }
}


