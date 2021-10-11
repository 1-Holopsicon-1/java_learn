package home.work;

import java.util.Scanner;

public class ThirdTask {
    public static boolean thirdTask(int in1, int in2){
        if (in1 % 10 == in2 % 10){
            System.out.println("Da");
            return true;
        }else{
            System.out.println("Net");
            return false;
        }
    }
}
