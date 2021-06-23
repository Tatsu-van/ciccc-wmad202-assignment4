package ca.ciccc.wmad202.assignment4.problem8;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem8 {
    public static void problem8(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number between 40 - 100: ");
        int topLimit = in.nextInt();
        System.out.print("Please enter a number used for division : ");
        int number = in.nextInt();
        Integer[] divisibleList = createDivisibleList(topLimit, number);
        System.out.println("These number are divisible by " + number + " between 2 to " + topLimit);
        System.out.println(Arrays.toString(divisibleList));
    }

    public static Integer[] createDivisibleList(int topLimit, int number){
        ArrayList<Integer> baseList = new ArrayList<Integer>();
        for(int i = 2; i < topLimit; i++){
            if(i % number == 0){
                baseList.add(i);
            }
        }
        Integer[] divisibleList = baseList.toArray(new Integer[0]);
        return divisibleList;
    }
}
