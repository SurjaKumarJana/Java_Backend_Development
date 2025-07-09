
/*
 * in this program we will take input from the user and then check a number
 * is present how many time in this list
 *
 */
package com.surja.collection.iterableInterface.collectionInterface.listInterface.arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class CountRepeatNo {
    public static void main(String[] args) {
        // creating objects
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Integer> indeces = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n =0;
        // taking list as input
        System.out.println("Enter the numbers : ");
        while(n<10){
            nums.add(sc.nextInt());
            n++;
        }
        //geting the searching item
        System.out.println("Enter the number to search : ");
        int item = sc.nextInt();
        //process
        int count=0, length=nums.size();
        for(int i =0; i<length;i++){
            int x = (int)nums.get(i);
            if(x == item){
                count++;
                indeces.add(i);
            }
            
        }

        //showing the result
        System.out.print("Given List is :");
        System.out.println(nums);
        System.out.println(item +" is present in the List "+count+" times at the indeces "+indeces);
        
        
    }
    
}
