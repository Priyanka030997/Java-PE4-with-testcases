package com.stackroute.pe4;

public class OccurrenceOfCharacter {
    //count the particular character present in string
    public int CountOccurrenceOfCharacter(String str,char character )
    {
        int count;
        int length1=str.length();
//replace the character with empty
        String str2=str.replaceAll(""+character,"");
        int length2=str2.length();
        if(length1==length2)
        {
            count=0;
        }
        else {

            count = length1 - length2;
        }

        return count;

    }

}
