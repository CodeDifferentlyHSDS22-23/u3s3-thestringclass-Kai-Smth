package com.codedifferently.labs.partB.ex03;

public class Replace {
    public static String sentence(){
        String response = "";
        String sentence = "Using String replace to replace character";
        String updatedSentence = sentence.replace("r", "R");
        response = updatedSentence;
        return response;
    }
    
    public static void main(String[] args) {
        String sentenceOutput = sentence();
        System.out.println(sentenceOutput);
    } 
}
