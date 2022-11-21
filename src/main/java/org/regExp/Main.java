package org.regExp;
@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        //RegExLib.com
        /*
        \\d - one digit
        \\w - one letter
        \\w==[a-zA-Z]
        \\d+ - 1 or more
        \\d* - 0 or more
        -\\d - negative digit
        ?\\d - 0 or 1 character
        ( | | )-
        [a-zA-Z]-every letter
        [0-9]-every digit
        [^abc] - any character except 'abc'
        . - any character
        {2} - 2 characters before(\\d{2})
        {2, } - 2 or more characters(\\d{2, })
        {2, 4} - from 2 to 4 characters(\\d{2, 4})
         */
        String a = "-100";
        String b = "100";
        String c = "+100";
        System.out.println(c.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(a.matches("(-|\\+)?\\d*"));
        String d = "11abbccc123";
        System.out.println(d.matches("[a-zA-z]*\\d+"));
        String e = "sdfabc";
        System.out.println(e.matches("[^abc]*"));
        String url = "https://mail.google.com";
        String url1 = "https://seznam.cz";
        String url2 = "https://ukr.net";
        System.out.println(url.matches("https://.+\\.(com|cz)"));
        System.out.println(url1.matches("https://.+\\.(com|cz)"));
        System.out.println(url2.matches("https://.+\\.(com|cz)"));
        String f= "123";
        System.out.println(f.matches("\\d{2,}"));
    }
}
