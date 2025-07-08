/*
 * Java Multithreading
 * ----------------------------------
 *
 * Program:
 * A program is a set of instructions written in a programming language
 * to perform a specific task. It is stored on disk and is not yet executing.
 * like - MyApp.java it is a program which is stored in disk
 *
 * Process:
 *
 * A process is an executing instance of a program. It has its own memory space,
 * resources, and execution context. Each process runs independently.
 *
 * suppose we run the Chrome.exe program , then the os creates process for this program
 * so , process is nothing but  the running instace of program
 * we can have as many as instance we want depending on the system capability.
 *
 * Thread:
 * A thread is a small unit of a process that runs independently.
 * It allows a program to perform multiple tasks at the same time.
 *
 * All threads in the same process share the same memory, but each thread has its own call stack.
 * In Java, you can create a thread by extending the Thread class or implementing the Runnable interface.
 *
 * ============================================================
 *                    Multitasking in Java
 * ============================================================
 *
 * Definition:
 * -------------
 * Multitasking is the ability of a system to perform
 * multiple tasks (or processes) at the same time.
 *
 * Java supports multitasking to make programs more efficient,
 * responsive, and faster by keeping the CPU busy.
 *
 * Types of Multitasking:
 * --------------------------
 * 1. Process-based Multitasking (Multiprocessing)
 * 2. Thread-based Multitasking (Multithreading)
 *
 *
 * 1. Process-based Multitasking (Multiprocessing):
 * -------------------------------------------------
 * - Each task runs as a separate process (application).
 * - Each process has its own memory and resources.
 * - Managed by the Operating System.
 *
 * Example:
 *   - Running Chrome, Spotify, and VS Code simultaneously.
 *
 *
 * 2. Thread-based Multitasking (Multithreading):
 * -----------------------------------------------
 * - A single program can run multiple tasks using threads.
 * - All threads share the same memory.
 * - Managed by the JVM (in Java).
 *
 * Example:
 *   - A browser using one thread to render the page,
 *     another to play a video, and another to handle user input.
 *
 *

 *
 * Multithreading:
 *
 * Multithreading is a Java feature that allows concurrent execution of two or more
 * threads. It helps in utilizing CPU efficiently and improving application performance.
 * Java provides built-in support for multithreading through the java.lang.Thread class
 * and java.lang.Runnable interface.
 *
 * Key Advantages:
 * - Better resource utilization
 * - Faster program execution
 * - Efficient CPU usage
 * - Useful in real-time systems (games, servers, etc.)
 */


package com.surja.multiThreading;

public class BasicsOfMultiThreading {

}
