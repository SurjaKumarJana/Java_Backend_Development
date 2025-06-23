//take a input of string
// remove any special character from the string
// remove extra spaces
// count the number of words

package com.fundamental.stringdemo.Regex.Practise;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        // taking input from user
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence =sc.nextLine();

        // removing all the special char
        // we are using string.replaceAll("regex", "replacement");
        // [^a-zA-Z0-9\\s] --> this regex means any thing except alphabet all case and spaces then it will replace witha an empty string
        String sentence2 = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("After removing special characters : "+sentence2);


        // removing extra spaces 
        // to remove extra spaces , we will use string.replace("regex", "replacement");
        // we wil use \S this meta character and + means more than 1 times , if spaces are their more than one time then it will replaaced by a single space and after that we will trim it to remove all the leading and lagging spaces
        String sentence3 =(sentence2.replaceAll("\\s+", " ")).trim();
        System.out.println("After removing extra spaces :"+sentence3);


        // counting the number of words
        // we wil use str.split("regex"); method , this will return a array of strings and all the strings are split on the basis of regex
        // like here we use \s ,means space as an regex so all the strings will be split on the basis of spaces 
        
        String words[] = sentence3.split("\\s");
        System.out.println("The number of words is : "+words.length);


    }
    
}
