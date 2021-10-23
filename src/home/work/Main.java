package home.work;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HubList<String> youList = new HubList<String>();
        youList.add("ccc");
        youList.add("b");
        youList.add("aa");
        System.out.println(youList); //[ccc, b, aa]
        System.out.println(youList.find("b")); //1
        System.out.println(youList.find("s")); //-1
        youList.sort(new HubStringComparator());
        System.out.println(youList); //[b, aa, ccc]
        System.out.println(youList.removeAt(1)); //aa
        System.out.println(youList); //[b, ccc]
    }
}

