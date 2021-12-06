package com.companey;
import java.util.Arrays;
import java.util.List;

public class Chek extends RomanNum{
    public static boolean Arabian(String num){
        for( int x = 0; x< num.length(); x++){
           if((int)num.charAt(x)<58 && (int) num.charAt(x)>48){continue;}
           else {return false;}}
        return true;
    }
        public static boolean Roman(String num){
        for (int x= 0; x<num.length();x++){
            int t = (int)num.charAt(x);
            if (t == 73|| t == 86 || t == 88){continue;}
            else {return false;}}
        return true;
        }
        public static String MainChec (String num1, String num2) {
            if (Arabian(num1) && Arabian(num2)) {
                return ("Arabian");
            } else if (Roman(num1) && Roman(num2)) {
                return ("Roman");
            } else {
                return ("Alarm");
            }
        }
}







