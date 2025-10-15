package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else if (numbers.contains(",")) {
            String[] nums = numbers.split(",");
            int num1 = Integer.valueOf(nums[0]);
            int num2 = Integer.valueOf(nums[1]);

            return num1 + num2;
        }

        // Single number case
        else {
            return Integer.valueOf(numbers);
        }
    }
}
    
