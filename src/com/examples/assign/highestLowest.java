package com.examples.assign;

/*1. Write a program to find the highest and lowest for a given list of numbers
        input: {1, 15, -1, 23, 45, 70, 99, -13, -5}
        output:
        HIGHEST NUMBER: 99
        LOWEST NUMBER: -13*/

/*2. Continue with the above example and find out the difference between highest and lowest numbers
        Output:
        Difference between highest and lowest is: 112*/

public class highestLowest {
    public static void main(String[] args){
        int list1[]={1,15, 23, 45, 70, 99, -13, -5};
        int highestNumber=0, lowestNumber=0, difference=0;
        for(int i=0; i<list1.length; i++){
            if (highestNumber<list1[i]){
                highestNumber=list1[i];
            }

           else if(lowestNumber>list1[i]){
                lowestNumber=list1[i];
            }
        }
        System.out.println("HIGHEST NUMBER: " + highestNumber);
        System.out.println("LOWEST NUMBER: " + lowestNumber);

        /*2. Continue with the above example and find out the difference between highest and lowest numbers
        Output:
        Difference between highest and lowest is: 112*/

        difference = highestNumber-lowestNumber;
        System.out.println("Difference between highest and lowest is: " + difference);
    }
}
