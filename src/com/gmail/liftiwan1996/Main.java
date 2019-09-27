package com.gmail.liftiwan1996;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Title> tl = new ArrayList<>();

        Bookdescription bd = new Bookdescription("Java is the best", "World is Java");
        tl.add(bd);

        Arcticle ar = new Arcticle("Java is the best", "World is Java");
        tl.add(ar);

        WikiArcticle warc = new WikiArcticle("Java is the best", "World is Java");
        tl.add(warc);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input please key word");
        new Title().keyword = sc.nextLine();

        tl.get(0).toString();
        tl.get(1).toString();
        tl.get(2).toString();

    }
}
