package org.surja.annotations.userDefineAnnotation;

/**
 * in this program we are going to discuss about the implementation of user define annotation 
 * how to write an user define annotation , this type of annotation doesn't have any direct impact on 
 * the program by it is very helpfull for the metadata purpose
 * <p>
 * @author Surja Kumar Jana
 * @date 21/03/2025
 **/



@interface MyAnno{
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
@MyAnno(developerName = "Surja Kumar Jana", developerEmpID ="java203", date ="2/03/2025" )
public class UserDefineAnno {
    public static void main(String[] args) {
        System.out.println("hii");
        
    }

    
}