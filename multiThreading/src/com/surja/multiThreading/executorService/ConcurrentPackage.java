/*
 * ============================================================================
 *                         java.util.concurrent PACKAGE
 * ============================================================================
 *
 * The java.util.concurrent package is part of the Java Concurrency API.
 * It provides tools for efficient, scalable, and thread-safe concurrent programming.
 *
 * It includes:
 *   - Task execution and thread pools
 *   - Concurrent data structures
 *   - Synchronization utilities
 *   - Lock-free atomic operations
 *
 */
/*
 * ================================================================================
 * 1. EXECUTION FRAMEWORK
 * ================================================================================
 *
 * Interfaces and classes used to manage and execute asynchronous tasks.
 *
 * Executor                    - Basic interface with one method: execute(Runnable)
 * ExecutorService             - Extends Executor; adds lifecycle control, submit()
 * ScheduledExecutorService    - Extends ExecutorService; supports task scheduling
 * Executors                   - Utility class to create thread pools
 * ThreadPoolExecutor          - Core implementation of ExecutorService
 * ScheduledThreadPoolExecutor - Implementation for scheduled tasks
 *
 */
/*
 * ================================================================================
 * 6. SUMMARY: CATEGORIES AND COMPONENTS
 * ================================================================================
 *
 * CATEGORY            | COMPONENTS
 * --------------------|---------------------------------------------------------
 * Task Execution       | Executor, ExecutorService, ThreadPoolExecutor
 * Task Scheduling      | ScheduledExecutorService, ScheduledThreadPoolExecutor
 * Task Representation  | Runnable, Callable, Future, FutureTask
 * Concurrent Collections| ConcurrentHashMap, BlockingQueue, CopyOnWriteArrayList
 * Synchronization      | CountDownLatch, CyclicBarrier, Semaphore, Locks
 * Atomic Variables     | AtomicInteger, AtomicLong, AtomicReference
 * Utility Class        | Executors (factory methods to create executors)
 *
 * Use java.util.concurrent to build scalable, responsive, and thread-safe applications.
 */




/*               Executors
 * -------------------------------------------------------------------------------------
 * - Class: java.util.concurrent.Executors
 * - Type: Utility class (final)
 * - Purpose: Provides factory methods to create various pre-configured thread pools.
 * - It hides the complexity of thread pool creation by returning ExecutorService
 *   objects using default internal settings.
 *
 * Factory Methods Include:
 * -------------------------
 * - newFixedThreadPool(int nThreads)
 * - newCachedThreadPool()
 * - newSingleThreadExecutor()
 * - newScheduledThreadPool(int corePoolSize)
 *
 */

/*
 * ==============================================================================
 *                   DIFFERENCE BETWEEN Executors AND ThreadPoolExecutor
 * ==============================================================================
 *
 * Both belong to the java.util.concurrent package but serve different purposes.
 * Executors is a utility class. ThreadPoolExecutor is the actual implementation.
 *
 */

/*
 * 1. Executors (Utility Class)
 * ------------------------------------------------------------------------------
 * - Type: Final class (java.util.concurrent.Executors)
 * - Purpose: Provides static factory methods to create pre-configured thread pools.
 * - Returns: ExecutorService (interface)
 * - Internally uses ThreadPoolExecutor but hides configuration.
 *
 * Common Factory Methods:
 * - newFixedThreadPool(int nThreads)
 * - newCachedThreadPool()
 * - newSingleThreadExecutor()
 * - newScheduledThreadPool(int corePoolSize)
 *
 * Advantages:
 * - Simple to use
 * - Good for quick setup or small apps
 *
 * Limitations:
 * - Uses default configurations
 * - Often uses unbounded queues (can cause memory issues)
 * - No way to tune the pool once created
 *
 *
 */

/*
 * 2. ThreadPoolExecutor (Concrete Class)
 * ------------------------------------------------------------------------------
 * - Type: Concrete class (java.util.concurrent.ThreadPoolExecutor)
 * - Purpose: Actual implementation of a thread pool.
 * - Fully configurable: core threads, max threads, queue size/type, rejection policy.
 * - Implements ExecutorService.
 *
 * Constructor:
 * ThreadPoolExecutor(
 *     int corePoolSize,
 *     int maximumPoolSize,
 *     long keepAliveTime,
 *     TimeUnit unit,
 *     BlockingQueue<Runnable> workQueue,
 *     ThreadFactory threadFactory,
 *     RejectedExecutionHandler handler
 * )
 *
 * Advantages:
 * - Full control over thread pool behavior
 * - Can tune performance and handle overloads
 * - Recommended for production systems
 *
 *
 */

/* When to Use What?
 * -------------------------------------------------------------------------------------
 * Use Executors (factory methods) when:
 * - You want to get started quickly
 * - You don’t need custom settings (like max threads or queue size)
 * - Suitable for small/medium apps or learning

 * Use ThreadPoolExecutor directly when:
 * - You need control over thread pool behavior
 * - You want to avoid unbounded queues (which Executors uses)
 * - You want to configure rejection policies, custom queues, factories
 * - Required for production-grade or performance-critical applications
 */

package com.surja.multiThreading.executorService;

import java.util.concurrent.*;

public class ConcurrentPackage {
    public static void main(String[] args) {


        //example
        ExecutorService executorService = Executors.newFixedThreadPool(2);



        int  corePoolSize  =    5;
        int  maxPoolSize   =   10;
        long keepAliveTime = 2000;
        ExecutorService threadPoolExecutor =
                new ThreadPoolExecutor(
                        corePoolSize,
                        maxPoolSize,
                        keepAliveTime,
                        TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>(90)//queue size
                );



    }

}
