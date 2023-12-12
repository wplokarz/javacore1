package org.example;

public class Task2 {
    public static void main(String[] args) {
        Task2 object = new Task2();
        System.out.println(object.reverseStringExampleOne("I'm going to go to school today morning."));
        System.out.println(object.reverseStringExampleTwo("I'm going to go to school today morning."));
        System.out.println(object.reverseStringExampleThree("I'm going to go to school today morning."));
    }

    // method to reverse given string
    private StringBuilder reverseStringExampleOne(String sampleText) {
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(sampleText);
        reversedString.reverse();
        return reversedString;
    }

    // method to reverse given string
    private StringBuffer reverseStringExampleTwo(String sampleText) {
        StringBuffer reversedString = new StringBuffer();
        for (int i = sampleText.length()-1;i>=0;i--) {
            char letter = sampleText.charAt(i);
            int position = reversedString.length();
            reversedString.insert(position, letter);
        }
        return reversedString;
    }

    // method to reverse given string
    private String reverseStringExampleThree(String sampleText) {
        char[] wordAsChar = sampleText.toCharArray();
        String reversedString = "";
        for (int i=sampleText.length()-1;i>=0;i--) {
            reversedString += wordAsChar[i];
        }
        return reversedString;
    }
}
