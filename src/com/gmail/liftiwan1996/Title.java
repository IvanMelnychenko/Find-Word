package com.gmail.liftiwan1996;

public class Title {
    public  String keyword;
    public Title() {
    }
    public int findStr(String input1, String input2, String search) {
        int result1 = 0;
        int result2 = 0;
        String[] s1 = input1.split(" ");
        String[] s2 = input2.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals(search)) {
                result1 = result1 + 1;
            }
        }
        for (int i = 0; i < s2.length; i++) {
            if (s2[i].equals(search)) {
                result2 = result2 + 1;
            }
        }
        return result1 + result2;
    }

    @Override
    public String toString() {
        return "Title{}";
    }
}

