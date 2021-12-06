package com.companey;
import java.util.Scanner;
import static com.companey.ArabNum.mainArabNum;

public class Main extends Chek {


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String op = scan.next();
        String num2 = scan.next();

        if (MainChec(num1, num2) == "Arabian"){
            System.out.println(mainArabNum(op,Integer.parseInt(num1), Integer.parseInt(num2)));}
        else if (MainChec(num1,num2) == "Roman"){
            System.out.println(finRim(op, num1, num2));}
        else if (MainChec(num1, num2) == "Alarm"){
        System.out.println("Throws exeption");}


    }


    }
