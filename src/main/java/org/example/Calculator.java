package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {



    

    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }else if(numbers.contains(",")) {
            String[] nums = numbers.split(",");
            int num1=Integer.valueOf(nums[0]);
            int num2=Integer.valueOf(nums[1]);

            return num1+num2;
        }

        // Single number case
        else {
            int num = Integer.valueOf(numbers);

            if (num < 0) {
                throw new IllegalArgumentException("negative numbers not allowed " + num);
            }

            return num;
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
