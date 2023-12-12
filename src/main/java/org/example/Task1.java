package org.example;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) throws IOException {
        Task1 object = new Task1();
        System.out.println(object.checkArrayOrder());
    }

    int arrayLength;
    int[] arrayNumber;
    String[] numbersFromUser;

    // method to toggle others and return provided by user array in ascending order
    public boolean checkArrayOrder() throws IOException {
        this.setArrayLength();
        this.getNumbersFromUser();
        if (!this.checkLengthOfArrays()) {
            System.out.println("Incorrect number of figures, array should has " + arrayLength + " numbers");
            return false;
        }
        this.createArrayOfInt();
        return this.checkIfArrayIsInAscendingOrder();
    }

    // get size of array from user and set length
    private void setArrayLength() {
        System.out.println("Length of array:");
        Scanner in = new Scanner(System.in);
        try {
            arrayLength = in.nextInt();
            arrayNumber = new int[arrayLength];
        } catch (NegativeArraySizeException ex) {
            System.out.println("It can't be negative value");
            System.exit(0);
        } catch (Exception ex) {
            System.out.println("It has to be integer");
            System.exit(0);
        }
    }

    // get numbers from user
    private void getNumbersFromUser() throws IOException {
        System.out.println("Figures");
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        numbersFromUser = bi.readLine().split(" ");
    }

    // create array from numbers provided by user
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

    // check if number of figures provided by user is the same as array size selected by user
    private boolean checkLengthOfArrays() {
        return numbersFromUser.length == arrayLength;
    }

    // check if numbers provided by user are in ascending order
    public boolean checkIfArrayIsInAscendingOrder() {
        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] <= arrayNumber[i-1]) {
                return false;
            }
        }
        return true;
    }
}