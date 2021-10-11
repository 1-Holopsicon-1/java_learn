package home.work;

import java.util.Scanner;

public class FirstTask {
    public static void firstTask(int in){
        if (in < 0){
            System.out.println("Лёд");
        }else if(in > 0 && in < 100){
            System.out.println("Водичка");
        }else{
            System.out.println("Пар");
        }
    }
}
