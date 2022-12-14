package com.codedifferently.labs.partB.ex01;

public class Indexing {
    public static String index() {
        String response = "";
        String myStr = "Hello planet earth, you are a great planet.";

        int idx1 = myStr.indexOf('e');
        int idx2 = myStr.indexOf('e', idx1 + 1);
        response += (idx2);
        return response;
    }

    public static void main(String[] args) {
        String indexOutput = index();
        System.out.println(indexOutput);
    }
}


