package com.interview.problemsolving;

import java.util.HashMap;

public class CountCharOccurence {
    public static void characterCount(String inputString){
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        
        //Print the count of characters repeated in string
        for (char c : strArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+1);
            }else{
                charCountMap.put(c, 1);
            }
        }
        System.out.print("Print the count of characters repeated in string:");
        System.out.println(charCountMap);
        
        //First Non Repeatable character in string
        char c;
        for (int i =0 ; i < inputString.length() ; i++ )
        {
            c= inputString.charAt(i);
            if( charCountMap.get(c) == 1 )
            System.out.println("First Non Repeatable character in string:"+c);
        }
    }
 
    public static void main(String[] args){
       characterCount("Java J2EE Java JSP J2EE"); 
       characterCount("All Is Well"); 
       characterCount("Done And Gone");
       characterCount("Asha");
    }
}