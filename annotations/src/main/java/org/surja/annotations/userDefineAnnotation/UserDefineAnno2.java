package org.surja.annotations.userDefineAnnotation;

/**
 * in this program we are going to discuss about the implementation of other user define annotation 
 * how to write an user define annotation , this type of annotation have impact the other annotation
 * 
 * those annotations are
 * 1.Retentio
 * 2.Documented
 * 3.Target
 * 4.Inherited
 * 5.Repeatable
 * 
 * @author Surja Kumar Jana
 * @date 21/03/2025
 **/

import java.lang.annotation.Documented;

@Documented
/**
 * this is my own define annotaion 
 * @author Surja Kumar Jana
 * 
 */
@interface MyAnno2{
    String developerName();
    String developerEmpID();
    String date();
    String javaVersion() default "21.02.036";
    String projectName() default "Developing the java ";
}

//user define annotation can  be use in 
// 1. class
// 2. method
// 3. variable
// 4. instance variable 
// all the levels

/**
 * this is my own annotation 
 * @author Surja Kumar Jana 
 */
public class UserDefineAnno2 {
    public static void main(String[] args) {
        
    }
    
}
