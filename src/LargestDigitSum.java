import java.util.Scanner;

public class LargestDigitSum {
    public static int findLargestDigitSum(String[] strings) {
        int maxSum = 0;
        String resultString = "";

        for (String s : strings) {
            int currentSum = sumOfDigits(s);
            if (currentSum > maxSum) {
                maxSum = currentSum;
                resultString = s;
            }
        }

        return maxSum;
    }

    private static int sumOfDigits(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        //Sample input data "dh7js4jf","or2rjvn2w","h1n36mfl","a7e6fw"
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sorted array of strings which has letters and numbers in it (space-separated, asending order): ");
        String inputArray = scanner.nextLine();
        String[] strings = inputArray.split(",");
        System.out.println("Largest Sum of Digits " + findLargestDigitSum(strings));
    }
}
