package com.companey;
import java.util.Map;
import java.util.*;
import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class RomanNum extends ArabNum {
    public static String finRim(String op, String num1, String num2){
        int mean1 = Rom(num1);
        int mean2 = Rom(num2);
        int mean = mainArabNum(op, mean1, mean2);
        String res = FinRom(mean);
        return (res);
    }

    public static int Rom(String roman){
        Map<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);

        int resoult = 0;
        for(int x = 0; x <roman.length();x++){
            char ch = roman.charAt(x);
            if (x>0 && numbersMap.get(ch)> numbersMap.get(roman.charAt(x-1))){
                resoult += numbersMap.get(ch) - 2* numbersMap.get(roman.charAt(x-1));
            }
          else resoult += numbersMap.get(ch);
        }
        return resoult;
    }
    public static String FinRom(int y){
        return join("",nCopies(y,"I"))
                .replace("IIIII","V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C");
    }

}
