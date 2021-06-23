package ca.ciccc.wmad202.assignment4.problem3;

import java.time.Year;
import java.util.Scanner;

public class Problem3 {
    public static void problem3(){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userNum = in.nextInt();
        System.out.print("Please choose style [1 - 3]: ");
        int userStyle = in.nextInt();

        while (userStyle < 1 || userStyle > 3){
            System.out.print("Please choose style [1 - 3]: ");
            userStyle = in.nextInt();
        }

        if(userStyle == 1){
            shape1(userNum);
        }
        else if(userStyle == 2){
            shape2(userNum);
        }
        else if(userStyle == 3){
            shape3(userNum);
        }


    }

    public static void shape1(int num){
        for(int i = num; i > 0; i = i - 2){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void shape2(int num){
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void shape3(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
