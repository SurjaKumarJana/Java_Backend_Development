package org.surja.annotations;

/**
 * this class is the version1 class and all the other classes will be inherited from it
 * @author Surja Kumar Jana
 */
class Version1{
    public void myMethod(){}
}
/**
 * this class is the first class that is inherited from the version1 class
 * and it's override the method myMethod()
 * @author Surja Kumar Jana
 */
class Version2 extends Version1{
    /**
     * writing this annotation is a good practise will overriding a method 
     * it gives warning if the method is not properly over rided 
     * 
     */
    @Override
    public void myMethod(){}
}
public class JavaAnnotations {
    
    
}
