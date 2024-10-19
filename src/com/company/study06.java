package com.company;
import java.util.Scanner;

public class study06 {
    public static void main(String[] args) {
        System.out.println("Taking marks of all the subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks 1:");
        float a = sc.nextFloat();
        System.out.println("Enter marks 2:");
        float b = sc.nextFloat();
        System.out.println("Enter marks 3:");
        float c = sc.nextFloat();
        System.out.println("Enter marks 4:");
        float d = sc.nextFloat();
        System.out.println("Enter marks 5:");
        float e = sc.nextFloat();
        float percentage  = (a + b + c + d + e) / 500 * 100;
        System.out.println("The percentage of the given marks is :  ");
        System.out.println(percentage);
    }


}

