package main;

import java.util.Scanner;

public class LargestDigitSum {
    public static int findLargestSum(String[] strings) {
        int maxSum = 0;
        String resultString = "";

        for (String s : strings) {
            int currentSum = extractAndSumOfDigits(s);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                resultString = s;
            }
        }

        return maxSum;
    }

    private static int extractAndSumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //By uncommenting the below code user can provide input
        //Sample input data "dh7js4jf","or2rjvn2w","h1n36mfl","a7e6fw"
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter array of strings which has letters and numbers in it: ");
        //String inputArray = scanner.nextLine();
        //String[] strings = inputArray.split(",");

        //Test1 with given sample data in challenge
        String[] testString1 = {"dh7js4jf","or2rjvn2w","h1n36mfl","a7e6fw"};
        System.out.println("Largest Sum of Digits Test1 is expected to print 13: " + findLargestSum(testString1));

        //Test 2 with one of the string having number at the end and other string having a leading number
        String[] testString2 = {"dh7js4j3","or2rjvn2w","h1n36mfl","0a7e6w"};
        System.out.println("Largest Sum of Digits Test2 is expected to print 14: " + findLargestSum(testString2));

        //Test 3 to accept array of string to have numbers alone
        String[] testString3 = {"12344","23345","345","9876555"};
        System.out.println("Largest Sum of Digits Test2 is expected to print 45: " + findLargestSum(testString3));

        //Test 4 to accept array of strings to have alpha chars alone
        String[] testString4 = {"abcd","hgfd","kkk","tfdd"};
        System.out.println("Largest Sum of Digits Test2 is expected to print 0: " + findLargestSum(testString4));
    }
}
