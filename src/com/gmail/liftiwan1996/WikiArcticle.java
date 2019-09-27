package com.gmail.liftiwan1996;

public class WikiArcticle extends Title {
    private String link;
    private String title;
    private String text;

    public WikiArcticle() {
        super();
    }

    public WikiArcticle(String link, String title, String text) {
        this.link = link;
        this.title = title;
        this.text = text;
    }

    public WikiArcticle(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "WikiArcticle contain your world" + findStr(new WikiArcticle().getTitle(), new WikiArcticle().getText(), keyword);
    }
}


