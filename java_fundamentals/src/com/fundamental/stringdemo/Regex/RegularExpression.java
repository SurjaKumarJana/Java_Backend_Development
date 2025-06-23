package com.fundamental.stringdemo.Regex;

/*
 * What is regular expression or regex?
 * ==> In Java, Regular Expressions or Regex   is an API for defining String patterns that can be used for searching,
 * manipulating, and editing a string in Java. Email validation and passwords are a few areas of strings where Regex is widely used to 
 * define the constraints. Regular Expressions in Java are provided under java.util.regex package.
 * 
 * 
 * examples:
 * 
 *  Regular Expression                   Description
 * ====================                 ===============
 * 1. " . "                             this means any character , alphabet or digit but it must be a single char
 * 2. [abc]                             this means a single character and the character must be between a,b or c
 * 3. [^abc]                            this means any single char except abc
 * 4. [abc][vz]                         the first character must be between a , b, c and the second char must be between v or z
 * 5. [a-zA-Z1-9]                       this char can be between a to z , A to Z and 1 to 9 anytthing between them but must be a single char
 * 6. A|B                               the char must be A or B
 * 7. XY                                the character must be exactly XY 
 * 
 *                                                         meta characters
 * ---------------------------------------------------------------------------------------------------------------------------------------
 * **while using meta characters we should use anothor \ (back slash) otherwise it will be considered as a escape sequences 
 * 
 *     Regular Expression                   Description
 * ========================              ======================
 * 1. \d                                    digits
 * 2. \D                                    not a digits
 * 3. \s                                    space
 * 4. \S                                    not a space
 * 5. \w                                    can be a digit or any alphabet
 * 6. \W                                    not a digit or any alphabet
 * 
 * 
 *                                                         Quantifiers
 * -------------------------------------------------------------------------------------------------------------------------------------------
 * quantifiers will decide how many number of times the pattern will repeat
 * like --> string1.matches("[abc]+");
 * 
 *     Regular Expression                   Description
 * ========================              ======================
 * 1. *                                     0 or more than 0 upto any number of times
 * 2. +                                     1 or more than 1 upto any number of times
 * 3. ?                                     0 or 1 times
 * 4. {X}                                   X number of times
 * 5. {X,Y}                                 this will specify the range that is form X up to Y
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








import java.util.regex.*;


public class RegularExpression {
    public static void main(String[] args) {
        String str = "acned1";
        System.out.println(str.matches("."));
        System.out.println(str.matches("[abc]"));
        System.out.println(str.matches("[^abc]"));
        System.out.println(str.matches("[abc][vz]"));
        System.out.println(str.matches(".[1-9]"));
        System.out.println(str.matches("a|B"));
        System.out.println(str.matches("XY"));
        System.out.println(str.matches("\\d"));
        System.out.println(str.matches("\\D"));
        System.out.println(str.matches("\\w"));
        System.out.println(str.matches("\\W"));
        System.out.println(str.matches("\\s"));
        System.out.println(str.matches("\\S"));

        System.out.println(str.matches("[abc]*"));
        System.out.println(str.matches(".*"));
        System.out.println(str.matches(".+"));
        System.out.println(str.matches("[abc]?"));
        System.out.println(str.matches("[abc]{5}"));
        System.out.println(str.matches("[abc]{5,8}"));

  
    }
    
}
