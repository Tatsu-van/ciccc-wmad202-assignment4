package ca.ciccc.wmad202.assignment4.problem7;
import java.util.Scanner;
import java.util.Arrays;

import static ca.ciccc.wmad202.assignment4.problem4.Problem4.createList;

public class Problem7 {
    public static void problem7(){
        Scanner in = new Scanner(System.in);
        int[] userList = createList();
        System.out.println("Your List: " + Arrays.toString(userList));
        System.out.print("Which number index do you want to get?: ");
        int targetNum = in.nextInt();
        System.out.println("Finding the number...");
        int result = linearSearch(userList, targetNum);
        if(result != -1){
            System.out.println("Got it! The index is " + result);
        }
        else {
            System.out.println("Sorry the number that you entered does not exist...");
        }
    }

    public static int linearSearch(int[] list, int num){
        int n = list.length;
        int index;
        for(int i = 0; i < n; i++){
            if(num == list[i]){
                  index = i;
                  return index;
            }
        }
        return -1;
    }
}
