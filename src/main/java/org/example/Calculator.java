package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public int add(String numbers){

        if(numbers.equals("")){
            return 0;
        }
        else {
            return Integer.valueOf(numbers);
        }
    }
}
