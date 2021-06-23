package ca.ciccc.wmad202.assignment4.problem2;

import java.util.Scanner;

import static ca.ciccc.wmad202.assignment4.problem1.Problem1.isPrime;

public class Problem2 {
    public static void problem2(){
        // Problem2
        System.out.println("\n\nProblem2---------------------\n");

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userNum = in.nextInt();

        System.out.println("finding next prime number...");

        int nextPrimeNum = nextPrime(userNum);

        System.out.println("The next prime number is: " + nextPrimeNum);
    }

    public static int nextPrime(int num){
        int nextPrimeNum = num + 1;

        while (!(isPrime(nextPrimeNum))){
            nextPrimeNum += 1;
        }
        return nextPrimeNum;
    }
}
