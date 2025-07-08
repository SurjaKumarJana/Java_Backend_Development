/*
 * Thread Life Cycle in Java
 * --------------------------
 * A thread in Java goes through several stages during its execution.
 * These stages are part of the thread life cycle, which is managed by the JVM.
 *
 * 1. NEW:
 *    - A thread is in this state when it is created using the Thread class, but not yet started.
 *    - Example: Thread t = new Thread();
 *
 * 2. RUNNABLE:
 *    - The thread is ready to run and waiting for CPU allocation by the thread scheduler.
 *    - It moves to this state after calling t.start().
 *
 * 3. RUNNING:
 *    - The thread is currently executing its task.
 *    - It moves from RUNNABLE to RUNNING when the CPU assigns it time.
 *
 * 4. BLOCKED:
 *    - The thread is blocked and waiting for a monitor lock (used in synchronization).
 *    - Example: when two threads try to enter a synchronized block at the same time.
 *
 * 5. WAITING:
 *    - The thread is waiting indefinitely for another thread to perform a particular action.
 *    - It can be moved to WAITING by methods like wait(), join(), or park().
 *
 * 6. TIMED_WAITING:
 *    - The thread is waiting for a specified period of time.
 *    - It can be moved here by methods like sleep(ms), wait(ms), or join(ms).
 *
 * 7. TERMINATED (or DEAD):
 *    - The thread has completed execution or has been stopped due to an error.
 *    - Once terminated, a thread cannot be restarted.
 *
 * Summary:
 *  NEW --> RUNNABLE --> RUNNING --> (WAITING / BLOCKED / TIMED_WAITING) --> TERMINATED
 */


package com.surja.multiThreading;

import com.surja.multiThreading.create.ThreadClass.MyThread;

public class ThreadLifeCycle {
    public static void main(String[] args) throws InterruptedException {


        int v = 1920;
        String s  =new String("Variable");
        MyThread myThread = new MyThread();
        myThread.setName("Worker-01");
        // this myThread object is now in new state

        myThread.start();
        // now this thread goes to runnable state
        // wait for the execution
        // currently main thread is running so this thread have to wait for the
        // the complete execution of the main thread


        // example
        myThread.run();
        // we can see that run() method is invoked on main thread

        System.out.println("This is main Thread ");
        System.out.println("This is main Thread ");

        myThread.join();
        //now the main thread is moved to waiting state
        // and the myThread gets the execution time

        System.out.println("This is main Thread ");



    }
}
