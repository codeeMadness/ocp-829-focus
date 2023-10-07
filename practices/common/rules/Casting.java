package common.rules;

import java.util.concurrent.atomic.AtomicInteger;

public class Casting {
    public static void main(String[] args) {
//        float egg = (float) (2.0 / 9);
//        int tadpole = (int)(5 * 2L);
//        short frog = (short) (3 - 2.0);
//
//        long b = 1.0;
//
//        long reptile = 192301398193810323L;
//
//        double a = 9/2; //float

//        int pig = (short) 4;
//        pig = pig++;
//
//       long goat = 2;
//       goat -= 1.0;
//
//        System.out.println(pig);
//        System.out.println(2 - 1.0);


        String s = "helloworld";
        String s1 = "hello";
        String s2 = "world";
        String s3 = s1 + s2;
        System.out.println(s == s3);
        String s4 = s3.intern();
        System.out.println(s == s4);


    }
}
