package com.gmail.liftiwan1996;

public class Arcticle extends Title {
    private String author;
    private String title;
    private String journal_name;
    private int year;
    private int number_jour;
    private String text;

    public Arcticle() {
    }

    public Arcticle(String author, String title, String journal_name, int year, int number_jour, String text) {
        this.author = author;
        this.title = title;
        this.journal_name = journal_name;
        this.year = year;
        this.number_jour = number_jour;
        this.text = text;
    }

    public Arcticle(String title, String text) {
        this.title = title;
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

    public String getJournal_name() {
        return journal_name;
    }

    public void setJournal_name(String journal_name) {
        this.journal_name = journal_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber_jour() {
        return number_jour;
    }

    public void setNumber_jour(int number_jour) {
        this.number_jour = number_jour;
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
        return "Arcticle contain your world" + findStr(new Arcticle().getTitle(), new Arcticle().getText(), keyword);

    }
}


