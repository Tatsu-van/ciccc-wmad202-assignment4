package ca.ciccc.wmad202.assignment4.problem4;

import java.util.*;

public class Problem4 {
    public static void problem4(){
        int[] userList = createList();

        System.out.println(Arrays.toString(userList));
        Arrays.sort(userList);
        int mostRepeatedNum = findMostRepeated(userList);
        System.out.println("The number that is repeated the most is " + mostRepeatedNum);

    }

    public static int[] createList(){
        Scanner in = new Scanner(System.in);
        System.out.print("How many elements do you want to have inside a list?: ");
        int length = in.nextInt();
        int[] userList = new int[length];
        int count = 0;
        int currentIndex = 0;
        while (count < length){
            System.out.print("Please enter a num: ");
            int currentNum = in.nextInt();
            userList[currentIndex] = currentNum;
            count += 1;
            currentIndex += 1;
        }
        return userList;
    }

    public static int findMostRepeated(int[] list){
        int mostRepeatedNum = list[0];
        int length = list.length;
        int maxNum = 1;
        int currentNum = list[0];
        int repeatTime = 0;
        for(int i = 0; i < length; i++){
            if(currentNum == list[i]){
                repeatTime += 1;
            }
            else {
                if(repeatTime > maxNum){
                    mostRepeatedNum = currentNum;
                    maxNum = repeatTime;
                }
                currentNum = list[i];
                repeatTime = 0;
                i = i - 1;
            }
        }

        if(repeatTime > maxNum) {
            mostRepeatedNum = currentNum;
            maxNum = repeatTime;
        }
        return mostRepeatedNum;
    }

}
