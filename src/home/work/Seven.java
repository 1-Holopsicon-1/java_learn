package home.work;

public class Seven {
    public static boolean svenTask(String arr){
        char[] arr_char = arr.toCharArray();
        boolean out = false;
        if (arr_char[2] == ':' && arr_char[5] == ':'){
            for(int i = 0; i < arr_char.length; i++){
                if (i == 2 || i == 5){
                    continue;
                }else{
                    try {
                        String tmp = new String(String.valueOf(arr_char[i]));
                        Double.parseDouble(tmp);
                    } catch(NumberFormatException e){
                        out = false;
                        break;
                    }
                }
            }
            out = true;
        }
        return out;
    }
}
