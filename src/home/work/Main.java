package home.work;

import java.util.Arrays;
import java.util.Scanner;


/*
* WARNING ALERT
* Данное меню было сделано только для быстрый проверки
* Тут нет защиты от "дурака" и тд так что не надо это пытаться ломать
* */

class Main{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Выбирете номер задания 1-6 & 8-10");
        int in = scanner.nextInt();
        switch (in){
            case (1):
                System.out.println("Ведите число градусов: ");
                int inner = scanner.nextInt();
                FirstTask.firstTask(inner);
                break;
            case (2):
                System.out.println("Введите возраст: ");
                inner = scanner.nextInt();
                System.out.println(SecondTask.secondTask(inner));
                break;

            case(3):
                System.out.println("Введите 2 числа");
                inner = scanner.nextInt();
                int tmp = scanner.nextInt();
                System.out.println(ThirdTask.thirdTask(inner, tmp));
                break;

            case (4):
                System.out.println("Введите 3 числа");
                inner = scanner.nextInt();
                tmp = scanner.nextInt();
                int tmp2 = scanner.nextInt();
                System.out.println(ForthTask.forthTask(inner, tmp, tmp2));
                break;

            case (5):
                System.out.println("Введите строку");
                String inner_s = scanner.next();
                System.out.println(FivthTask.fivthTask(inner_s));
                break;

            case (6):
                System.out.println("Введите строку");
                inner_s = scanner.next();
                System.out.println(Six.sixTask(inner_s));
                break;

            case (8):
                System.out.println("Введите количество чисел в массиве");
                int cnt = scanner.nextInt();
                int[] array = new int[cnt];
                for (int i = 0; i < cnt; i++){
                    System.out.println("Введите елемент массива");
                    array[i]=scanner.nextInt();
                }
                System.out.println(Eight.eighTask(array));

            case (9):
                System.out.println("Введите количество чисел в массиве 1");
                int cnt1 = scanner.nextInt();
                int[] array1 = new int[cnt1];
                for (int i = 0; i < cnt1; i++){
                    System.out.println("Введите елемент массива 1");
                    array1[i]=scanner.nextInt();
                }
                System.out.println("Введите количество чисел в массиве 2");
                int cnt2 = scanner.nextInt();
                int[] array2 = new int[cnt1];
                for (int i = 0; i < cnt2; i++){
                    System.out.println("Введите елемент массива 2");
                    array2[i]=scanner.nextInt();
                }
                System.out.println(Arrays.toString(Nine.nineTask(array1, array2)));

            case (10):
                System.out.println("Введите количество чисел в массиве");
                cnt = scanner.nextInt();
                int[] array_ten = new int[cnt];
                for (int i = 0; i < cnt; i++){
                    System.out.println("Введите елемент массива");
                    array_ten[i]=scanner.nextInt();
                }
                System.out.println(Arrays.toString(Ten.tenTask(array_ten)));
        }
    }
}
