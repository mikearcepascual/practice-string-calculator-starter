package com.tw;
import java.lang.String;

public class StringCalculator {
    public int add(String string) {
        if(!string.isEmpty()) {
            int sum = 0;
            for(String s : string.split("[,\n;]|[^0-9]")){
                if(!s.isEmpty()){
                    sum += Integer.parseInt(s.trim());
                }
            }
            return sum;
        }
        return 0;
    }


}

