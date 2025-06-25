package santhoshYakasiri_java_project;

import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers separated by commas (e.g. 1,2,3,4):");
        String[] inputStr = scanner.nextLine().split(",");

        int[] input = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            input[i] = Integer.parseInt(inputStr[i].trim());
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : input) {
                if (num % i == 0) {
                    count++;
                }
            }
            result.put(i, count);
        }
        System.out.println("Output:");
        System.out.println(result);
    }
}
