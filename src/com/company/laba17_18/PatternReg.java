package com.company.laba17_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternReg {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        String str  = "abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + pattern.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + pattern.matcher(str).matches());

        System.out.println("_____________________");

        pattern = Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]{2}+:){2}+[0-9]{2}");
        str = "aE:dC:cA:56:76:54";
        System.out.println(str + ": " + pattern.matcher(str).matches());

        str  = "01:23:45:67:89:Az";
        System.out.println(str + ": " + pattern.matcher(str).matches());

        System.out.println("_____________________");

        //pattern = Pattern.compile("(?:^|[\\n\\r]|[^\\w\\d\\.])([1-9]\\d*(?:.\\d{2})?\\s*(?:USD|EU|RUR))\\b");

        pattern = Pattern.compile("[\\d]+\\.[\\d]{2} (USD|RUR|EU)");
        Matcher matcher = pattern.matcher("5.62 USD");

        System.out.println(matcher.matches());

        Pattern pattern2 = Pattern.compile("(?<price>[\\d]+\\.[\\d]{2} (USD|RUR|EU))");
        Matcher matcher2 = pattern2.matcher("23.78 USD\n" +
                "23.75USD\n" +
                "23.76 USD\n" +
                "15.16 RUR\n" +
                "23.76 EU\n" +
                "23.76DUR\n" +
                "23.76 DUR\n" +
                "23,76 USD");

        while (matcher2.find()) {
            System.out.println(matcher2.group("price"));
        }
    }
}
