package ca.ciccc.wmad202.assignment4.problem10;

public class Problem10 {
    public static void evaluate(int option){
        switch (option){
            case 1: Problem10_1.run();break;
            case 2: Problem10_2.run();break;
            case 3: Problem10_3.run();break;
            case 4: Problem10_4.run();break;
            default: System.out.println("Option is valid");
        }
    }
}
