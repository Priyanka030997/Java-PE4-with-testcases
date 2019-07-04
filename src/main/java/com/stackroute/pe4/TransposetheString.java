package com.stackroute.pe4;

public class TransposetheString {
    //transpose the string
    public String TransposetheGivenString(String str)
    {
       String arr[]=str.split(" ");
        String result="";
        //sort each word in the given string
       for(int i=0;i<arr.length;i++)
       {
           char arr2[]=arr[i].toCharArray();
           String reverse="";
           for(int j=(arr2.length)-1;j>=0;j--)
           {
               reverse=reverse+arr2[j];
           }
           result=result+reverse+" ";
       }
       return result.trim();
    }
}
