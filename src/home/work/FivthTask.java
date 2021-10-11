package home.work;

import java.util.*;

public class FivthTask {
    public static String fivthTask(String arr){
        char[] arr2 = new char[arr.length() + 2];
        char[] char_tranformer = arr.toCharArray();
        arr2[0] = char_tranformer[char_tranformer.length - 1];
        for (int i = 0; i < char_tranformer.length; i++){
            arr2[i + 1] = char_tranformer[i]; 
        }
        arr2[arr2.length - 1] = char_tranformer[char_tranformer.length - 1];
        return new String(arr2);
    }
}
