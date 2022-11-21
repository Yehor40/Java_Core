package org.regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String text = "Lorem ipsum joe@gmail.com sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."+
                "Ut enim ad  doe@seznam.cz minim veniam, quis nostrud exercitation ullamco";
        Pattern pt = Pattern.compile("(\\w+)@(gmail|seznam)\\.(com|(cz))");
        Matcher matcher  = pt.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group(4));
        }
    }
}

