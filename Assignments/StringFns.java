package assignment;

import java.util.Arrays;
import java.util.Locale;

public class StringFns {
    public static void main(String[] args) {
        String a="Hello";
        String b=new String("Hello");
        System.out.println(a.length());
        System.out.println(a.equals(b));
        System.out.println(a.charAt(0));
        System.out.println(b.substring(2,5));
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.compareTo(b));
        System.out.println(a.toCharArray());
        String c="hi hello how are you";
        System.out.println(Arrays.toString(c.split(" ")));
        System.out.println(c.indexOf("h"));
        System.out.println(c.lastIndexOf("h"));
        System.out.println(c.contains("are"));
        System.out.println(c.contains("Are"));
    }
}


OUTPUT:
        5
        true
        H
        llo
        hello
        HELLO
        0
        Hello
        [hi, hello, how, are, you]
        0
        9
        true
        false
