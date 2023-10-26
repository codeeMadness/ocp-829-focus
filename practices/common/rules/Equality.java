package common.rules;

import java.util.Arrays;

public class Equality {

    public void demoEquality() {
        var one = new StringBuilder();
        var two = new StringBuilder();
        var three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        //check the values inside the String rather than the string reference itself
        var x = "Hello World";
        var z = " Hello World".trim();
        System.out.println(x.equals(z)); // true

        //they are completely different types
        var name = "a";
        var builder = new StringBuilder("a");
//        System.out.println(name == builder); // DOES NOT COMPILE
    }

    public static void main(String[] args) {

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        alias[0] = "abc";
        System.out.println(bugs.equals(alias));
        System.out.println(Arrays.toString(bugs));

    }
}
