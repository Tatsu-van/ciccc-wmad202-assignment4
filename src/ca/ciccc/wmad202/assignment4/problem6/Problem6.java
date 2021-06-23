package ca.ciccc.wmad202.assignment4.problem6;

import java.util.ArrayList;
import java.util.Arrays;

import static ca.ciccc.wmad202.assignment4.problem4.Problem4.createList;

public class Problem6 {

    public static void problem6(){
        int[] userList = createList();
        System.out.println(Arrays.toString(userList));
        System.out.println("Removing repeated number...");
        Integer[] distinctList = removeNum(userList);
        System.out.println("The result: " + Arrays.toString(distinctList));
    }

    public static Integer[] removeNum(int[] list){
        int n = list.length;
        ArrayList<Integer> listNew = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            if(!(listNew.contains(list[i]))){
                listNew.add(list[i]);
            }
        }

        Integer[] distinctList = listNew.toArray(new Integer[0]);

        return distinctList;
    }
}
