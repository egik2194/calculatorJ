package com.companey;

public class ArabNum {
    public static int mainArabNum(String op, int num1, int num2){
        switch (op){
            case "+":
                int res1 = num1 + num2;
                return(res1);
            case "-":
                int res2 = num1 - num2;
                return(res2);
            case "*":
                int res3 = num1 * num2;
                return(res3);
            case "/":
                int res4 = num1 / num2;
                return(res4);

        }
        return num1;
    }
}

