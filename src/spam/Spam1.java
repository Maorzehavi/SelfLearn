package spam;

import java.util.ArrayList;

public class Spam1 {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        ArrayList<String> test2 = new ArrayList<String>();

        test.add("shon");
        test.add("moshe");
        test.add("dan");
        test2=test;
        String[] names = test.toArray(new String[0]);
        System.out.println(names.length);
        for (String s : names) {
            System.out.println(s);

        }
        System.out.println(test.stream().toArray());
    }
}
