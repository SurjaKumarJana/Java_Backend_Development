package org.surja.annotations;

/**@author
 * this class is the updated version of JavaDocsDemo
 *  
 */
public class JavaDocsDemo2 {
   /**
    * @author Surja Kumar Jana
    * this is just a value
    */
   static int val = 10;
   
   /**
    * this is method that takes the book name
    * @param bookName
    */
   public void Book(String bookName){
   }
   
   /**
    * this method will issue a book for the student 
    * otherwise throws an exception
    * @param roll
    * @throws Exception
    */
   public void issue(int roll) throws Exception {
   }

   /**
    * this method is to check whether a book is available or not
    * @param bookName
    * @return
    */
   public boolean available(String bookName) {
       return true;
   }
   
   /**
    * this method is to get the name of book using its id
    * @param BookID
    * @return
    */
   public String getName(int BookID) {
       return "";
   }
    
}
