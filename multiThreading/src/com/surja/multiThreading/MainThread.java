/*
 * ============================================================================
 *                           MAIN THREAD IN JAVA
 * ============================================================================
 *
 * Every Java program runs inside a process (JVM).
 * When we start a Java application, JVM creates a main thread.
 *
 * This main thread is responsible for executing the code in the `main()` method.
 */



/*
 * ============================================================================
 *                     DEFAULT THREAD GROUP HIERARCHY IN JAVA
 * ============================================================================
 *
 * ThreadGroup: system         // Root group created by JVM
 * ├── JVM daemon threads:
 * │   ├── Finalizer
 * │   ├── Reference Handler
 * │   ├── Signal Dispatcher
 * │   └── Garbage Collector
 * └── ThreadGroup: main       // Where your program runs
 *     ├── main thread         // Executes main() method
 *     ├── Thread-0            // Custom thread created from main
 *     └── Thread-1, Thread-2  // etc.
 *
 * By default, all threads you create (unless you specify a group) will belong
 * to the same group as the thread that created them (usually "main").
 */



/*
 * ============================================================================
 *                              KEY POINTS
 * ============================================================================
 *
 * 1. The main thread is automatically created by the JVM.
 * 2. It is the thread that begins execution of the program (main method).
 * 3. It belongs to the "main" thread group.
 * 4. The "main" thread group is a child of the "system" thread group.
 * 5. Other user-defined threads (unless specified) also go into the "main" group.
 * 6. The main thread is non-daemon.
 * 7. JVM stays alive as long as at least one non-daemon thread is running.
 */




package com.surja.multiThreading;

public class MainThread {
}
