/**
 * This is a simple java program
 * in this program  , we will try to see how does the servers works basically
 *
 * In simple terms we can say that:
 * a server is program  that is running 24X7 on a machine and it is listening on a port and serve the
 * request data
 *
 * here this program is not listening on a port , it takes the request from the keyboard using a
 * InputStream and process the data
 *
 */

package org.surja;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {

    public static void main(String[] args) {

        System.out.println("Starting the server ....");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter the request data : ");
            String data = sc.nextLine();
            Runnable runnable = () -> process(data);
            executorService.submit(runnable);
        }


    }

    private static void process(String data){
        // it will take same time then print the data
        try {
            Thread.currentThread().sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        System.out.println("Data : " + data+ "   ||  Processed by : "+Thread.currentThread().getName());
    }
}
