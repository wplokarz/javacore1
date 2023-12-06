package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Task1 {
    int arrayLength;
    int[] arrayNumber;
    String[] numbersFromUser;

    private void setArrayLength() {
        System.out.println("Length of array:");
        Scanner in = new Scanner(System.in);
        try {
            arrayLength = in.nextInt();
        }
        catch (Exception ex) {
            System.out.println("It has to be integer");
            System.exit(0);
        }
    }

    private void setArray () {
        try {
            arrayNumber = new int[arrayLength];
        }
        catch (NegativeArraySizeException ex) {
            System.out.println("It can't be negative value");
            System.exit(0);
        }
    }
    private void getNumbersFromUser() throws IOException {
        System.out.println("Figures");
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        numbersFromUser = bi.readLine().split(" ");
    }

    private void createArrayOfInt() {
        try {
            for (int i = 0; i < arrayNumber.length; i++) {
                arrayNumber[i] = Integer.parseInt(numbersFromUser[i]);
            }
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong format");
            System.exit(0);
        }
    }

    private boolean checkLengthOfArrays() {
        return numbersFromUser.length == arrayLength;
    }
    public boolean arrayInAscendingOrder() {
        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] <= arrayNumber[i-1]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkArrayOrder() throws IOException {
        this.setArrayLength();
        this.setArray();
        this.getNumbersFromUser();
        if (!this.checkLengthOfArrays()) {
            System.out.println("Error");
            return false;
        }
        this.createArrayOfInt();
        return this.arrayInAscendingOrder();
    }

    public static void main(String[] args) throws IOException {
        Task1 object = new Task1();
        System.out.println(object.checkArrayOrder());
    }
}