package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//check particular word is present in the string
public class CheckWordinString {
    //By using pattern matcher I check word is present in string
    public String CheckNameintheString(String str1,String str2)
    {
        Pattern pattern=Pattern.compile(str2);
        Matcher matcher=pattern.matcher(str1);
        if(matcher.find())
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}
