package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {



    public static int CalculateSum(List<Integer> nums) {
        int sum = 0;
        ArrayList<Integer> negativeNos = new ArrayList<>();
        for (Integer num : nums) {
                sum += num;
        }

        return sum;
        }



    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        // Custom delimiter
        else if (numbers.startsWith("//")) {
            String delimiter = getDelimiter(numbers);
            String nos = getNumbers(numbers);
            List<Integer>parsedNumbers=parseNumbers(nos,delimiter);
            return CalculateSum(parsedNumbers);
        }

        // Handle comma or newline separated numbers
        else if (numbers.contains(",") || numbers.contains("\n")) {
            String[] nums = numbers.split(",|\n");

            ArrayList<Integer> parsedNumbers = new ArrayList<>();
            for (String element : nums) {
                parsedNumbers.add(Integer.valueOf(element));
            }

            return CalculateSum(parsedNumbers);
        }

        // Single number case
        else {
            int num = Integer.valueOf(numbers);

            return CalculateSum(Collections.singletonList(num));


        }
    }
    private String getDelimiter(String numbers) {
        if (numbers.startsWith("//")) {
            return numbers.substring(2, numbers.indexOf("\n"));
        }
        return ",";  // default delimiter
    }
    private String getNumbers(String numbers) {
        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            return numbers.substring(newlineIndex + 1);
        }
        return numbers;
    }
    private List<Integer> parseNumbers(String numbers, String delimiter) {

        String[] parts = numbers.split("[\n" + delimiter + "]");
        List<Integer> parsedNumbers = new ArrayList<>();

        for (String part : parts) {
            if (!part.trim().isEmpty()) {
                parsedNumbers.add(Integer.valueOf(part.trim()));
            }
        }
        return parsedNumbers;
    }
}