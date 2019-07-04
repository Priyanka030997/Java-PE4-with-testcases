package com.stackroute.pe4;

import java.util.Arrays;

public class SortTheWords {
    //sort the words in alphabetical order
    public String SortingtheWords(String str)
    {
       String arr[]=str.split(" ");
       String temp;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if(((arr[i]).compareToIgnoreCase(arr[j]))>0)
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
       String result="";
      for(int i=0;i<arr.length;i++)
      {
         result=result+arr[i]+" ";
      }
      System.out.print(result);
       return result.trim();
    }

}
