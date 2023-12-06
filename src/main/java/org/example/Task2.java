package org.example;

public class Task2 {
    private StringBuilder reverseStringExampleOne(String sampleText) {
        StringBuilder newWord = new StringBuilder();
        newWord.append(sampleText);
        newWord.reverse();
        return newWord;
    }

    private StringBuffer reverseStringExampleTwo(String sampleText) {
        StringBuffer newWord = new StringBuffer();
        for (int i = sampleText.length()-1;i>=0;i--) {
            char letter = sampleText.charAt(i);
            int position = newWord.length();
            newWord.insert(position, letter);
        }
        return newWord;
    }
    private String reverseStringExampleThree(String sampleText) {
        char[] wordAsChar = sampleText.toCharArray();
        String newWord = "";
        for (int i=sampleText.length()-1;i>=0;i--) {
            newWord += wordAsChar[i];
        }
        return newWord;
    }

    public static void main(String[] args) {
        Task2 object = new Task2();
        System.out.println(object.reverseStringExampleOne("I'm going to go to school today morning."));
        System.out.println(object.reverseStringExampleTwo("I'm going to go to school today morning."));
        System.out.println(object.reverseStringExampleThree("I'm going to go to school today morning."));
    }
}
