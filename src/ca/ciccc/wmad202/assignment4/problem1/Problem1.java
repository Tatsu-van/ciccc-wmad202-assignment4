package ca.ciccc.wmad202.assignment4.problem1;

import java.util.Scanner;

public class Problem1 {
    public static void problem1(){
        // Problem1
        System.out.println("Problem1---------------------\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userNum = in.nextInt();

        boolean result = isPrime(userNum);
        if(result){
            System.out.printf("Your number %d is prime" ,userNum);
        }
        else {
            System.out.printf("Your number %d is NOT prime" ,userNum);
        }
    }

    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
