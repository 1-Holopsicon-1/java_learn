package home.work;

public class ForthTask {
    public static int forthTask(int in1, int in2, int in3){
        if (in1 > in2 && in1 > in3){
            return (in1);
        }else if(in2 > in1 && in2 > in3){
            return (in2);
        }else if(in3 > in1 && in3 > in2){
            return (in3);
        }else{
            return  0;
        }
    }
}
