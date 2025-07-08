/*
 * Commonly Used Methods of Thread Class in Java
 * ---------------------------------------------
 * The java.lang.Thread class provides various methods to manage threads.
 * Below are some of the most commonly used methods:
 *
 * 1. start()
 *    - Starts a new thread.
 *    - Internally calls the run() method in a separate call stack.
 *    - A thread cannot be restarted once it is started.
 *    - Example: thread.start();
 *
 * 2. run()
 *    - Contains the code that defines the task to be executed by the thread.
 *    - Can be overridden in a custom Thread class or Runnable implementation.
 *    - Never call run() directly to start a thread; use start().
 *
 * 3. sleep(long millis)
 *    - Causes the currently executing thread to pause for a specified time (in milliseconds).
 *    - It is a static method.
 *    - Example: Thread.sleep(1000); // pauses for 1 second
 *    - Throws InterruptedException.
 *
 * 4. join()
 *    - Waits for a thread to die (finish execution).
 *    - Used when one thread needs to wait for another to complete.
 *    - Example: thread.join();
 *    - Throws InterruptedException.
 *
 * 5. isAlive()
 *    - Returns true if the thread is still running.
 *    - Useful to check if a thread has finished or is still active.
 *    - Example: thread.isAlive();
 *
 * 6. yield()
 *    - Causes the currently executing thread to pause and give other threads of the same priority a chance to run.
 *    - It is a static method.
 *    - It does not guarantee the current thread will stop.
 *
 * 7. setName(String name)
 *    - Sets a name for the thread.
 *    - Example: thread.setName("Worker-1");
 *
 * 8. getName()
 *    - Returns the name of the thread.
 *    - Example: String name = thread.getName();
 *
 * 9. setPriority(int priority)

 *    - Sets the priority of the thread (1 to 10).
 *    - Constants: MIN_PRIORITY (1), NORM_PRIORITY (5), MAX_PRIORITY (10)
 *    - Example: thread.setPriority(Thread.MAX_PRIORITY);
 *
 * 10. getPriority()
 *     - Returns the priority of the thread.
 *
 * 11. interrupt()
 *     - Interrupts a sleeping or waiting thread.
 *     - If the thread is not in a sleep/wait state, it sets an "interrupted" flag.
 *
 * 12. isInterrupted()
 *     - Checks if the thread has been interrupted.
 *
 * Note:
 * Most of these methods are declared in the Thread class, while a few are inherited from the Object class
 * (like wait(), notify(), and notifyAll()) and used in synchronization.
 */

//1. Constractors
//---------------------
/*              method name
 *              --------------
 *              Thread()
 *              Thread(Runnable r)
 *              Thread(Runnable r, String name)
 *              Thread(ThreadGrop g, String name)
 *              Thread(String s)
 *
 * 2. Getter and Setter methods
 * ------------------------------
 *              returnType                  method name
 *              ------------               -------------
 *              long                            getId()
 *              String                          getName()
 *              int                             getPriority()
 *              Thread.state                    getState()
 *              ThreadGroup                     getThreadGroup()
 *
 *
 *              void                            setName(String name)
 *              void                            setPriority(int p)
 *              void                            setDaemon(Boolean d)
 * 3.Enquire methods
 * ------------------------------
 *              returnType                  method name
 *              ------------               -------------
 *              Boolean                          isAlive()
 *              Boolean                          isDaemon()
 *              Boolean                          isInterupted()
 *
 * 4. Instance methods
 * ------------------------------
 *              returnType                  method name
 *              ------------               -------------
 *              void                            interupted()
 *              void                            join()
 *              void                            join(long milis)
 *              void                            run()
 *              void                            start()
 * 5. Static methods
 * ------------------------------
 *              returnType                  method name
 *              ------------               -------------
 *              int                             activeCount()
 *              Thread                          currentThread()
 *              void                            yeild()
 *              void                            dumpStack()
 */

package com.surja.multiThreading;

import com.surja.multiThreading.create.ThreadClass.MyThread;

public class CommonMethods {
    public static void main(String[] args) {
        //setting the main thread priority to max
        Thread.currentThread().setPriority(2);

        //creating a new thread
        MyThread myThread = new MyThread();
        //setting the  thread priority to 3
        myThread.setPriority(Thread.MIN_PRIORITY);
        myThread.start();
        myThread.setName("Worker-01");

        try {
            myThread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("MyThread is Alive  :"+myThread.isAlive());// it will show false
        System.out.println("MyThread Name      :"+myThread.getName());
        System.out.println("MyThread's Priority:"+myThread.getPriority());

    }
}
