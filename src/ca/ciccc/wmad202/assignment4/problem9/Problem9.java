package ca.ciccc.wmad202.assignment4.problem9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static ca.ciccc.wmad202.assignment4.problem1.Problem1.isPrime;
import static ca.ciccc.wmad202.assignment4.problem4.Problem4.createList;


public class Problem9 {
    public static void problem9(){
        Scanner in = new Scanner(System.in);
        int[] userList = createList();
        int n = userList.length;
        System.out.println("Your list: " + Arrays.toString(userList));
        System.out.print("Please choose index from 0 - " + n + ": ");
        int index = in.nextInt();
        System.out.println("Counting prime visibility until index " + index + " ...");
        int primeVisibility = primeVisibility(userList, index);
        System.out.println("The prime visibility is: " + primeVisibility);
    }

    public static int primeVisibility(int[] list, int index){
        int count = 0;
        for(int i = 0; i < index; i++){
            if(isPrime(list[i])){
                System.out.println(list[i]);
                System.out.println(isPrime(list[i]));
                count += 1;
            }
        }
        return count;
    }
}
