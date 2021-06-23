package ca.ciccc.wmad202.assignment4.problem5;

import java.util.ArrayList;
import java.util.Arrays;

import static ca.ciccc.wmad202.assignment4.problem4.Problem4.createList;

public class Problem5 {
    public static void problem5(){
        int[] userList = createList();
        Arrays.sort(userList);
        countRepeatTimes(userList);
    }

    public static void countRepeatTimes(int[] list){
        int length = list.length;
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        ArrayList<Integer> countList = new ArrayList<Integer>();
        for(int i = 0; i < length; i++){
            if(!(tempList.contains(list[i]))){
                tempList.add(list[i]);
            }
        }
        int currentNum = tempList.get(0);
//        System.out.println(Arrays.toString(tempList.toArray()));
        int count = 0;
        for(int item : tempList){
            for(int i = 0; i < length; i++){
                if(item == list[i]){
                    count += 1;
                }
            }
            countList.add(count);
            count = 0;
        }

//        System.out.println(Arrays.toString(countList.toArray()));
        int lengthOfTempList = tempList.size();
        for(int i = 0; i < lengthOfTempList; i++){
            System.out.println(tempList.get(i) + " is repeated " + countList.get(i) + " times");
        }
    }

}
