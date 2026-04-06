package Struct;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();

        list.add("Aasasdad");
        list.add("Bsasasdx");
        list.add("Csaqw");
        list.add("Ds");
        list.add("Eas");
        list.add("Fwer");
        list.add("G");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(), o2.length());
//            }
//        });

        System.out.println(list);;

        list.sort((s1, s2) ->  {
           return Integer.compare(s1.length(), s2.length());
        });
    }
}
