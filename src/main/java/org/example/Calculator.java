package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public int add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } else if (numbers.contains(",")) {
            int sum = 0;
            String[] nums = numbers.split(",");
            ArrayList<Integer> nos = new ArrayList<>();
            for (String value : nums) {
                nos.add(Integer.valueOf(value));
            }
            for (Integer num : nos) {
                sum += num;
            }
            return sum;
        }else{
            return Integer.valueOf(numbers);
        }


    }
}
