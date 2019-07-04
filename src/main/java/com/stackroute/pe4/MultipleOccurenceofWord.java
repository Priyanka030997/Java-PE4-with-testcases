package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurenceofWord {
    //find multiple occurrence of word in the given string
    public String FindMultipleOccurenceofWord(String str1, String str2) {
        int start = 0, end = 0;
        String result = "";
        int flag=0;
        Pattern pattern = Pattern.compile(str2);
        Matcher matcher = pattern.matcher(str1);
        while(matcher.find()) {
            //int result= matcher.start()+"-"+matcher.end()-1;
            start = matcher.start();
            end = matcher.end();
            flag=1;

            result = result + start + "-" + end + " ";

        }
        if(flag==0)
        {
            return "Not found";
        }
        return result.trim();

    }
}
