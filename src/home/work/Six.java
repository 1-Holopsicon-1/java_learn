package home.work;

public class Six {
    public static boolean sixTask(String arr){
        char[] arr_char = arr.toCharArray();
        boolean out = false;
        for(int i = 1; i < arr.length(); i++){
            if (arr_char[i] == arr_char[i-1] && arr_char[i] == 'x'){
                out = true;
                break;
            }
        }
        return out;
    }
}