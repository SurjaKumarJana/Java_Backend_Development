/*
 * ==============================================================
 *         Concurrency vs Parallelism vs Multithreading
 * ==============================================================
 *
 * 1. What is Concurrency?
 * --------------------------
 * - Concurrency means multiple tasks are in progress at the same time.
 * - They do not necessarily run at the exact same moment.
 * - Tasks share a single CPU by taking turns (context switching).
 * - This can happen on a single-core processor.
 *
 * Example:
 *   - A single-core CPU runs Thread A for some time, then switches to Thread B,
 *     and back again. It appears both are working together.
 *
 * 2. What is Parallelism?
 * --------------------------
 * - Parallelism means multiple tasks are executed at the exact same moment.
 * - Requires multiple CPU cores.
 * - Each thread can run on a separate core simultaneously.
 *
 * Example:
 *   - A 4-core CPU runs 4 threads at the same time on different cores.
 *
 * 3. What is Multithreading?
 * -----------------------------
 * - Multithreading means a single program runs multiple threads.
 * - Each thread can handle a different task (e.g., downloading, UI update, etc.).
 * - Multithreading allows concurrent execution of multiple parts of a program.
 *
 * 4. Does Multithreading mean Concurrency or Parallelism?
 * ----------------------------------------------------------
 * - Multithreading always results in **concurrent execution**.
 * - If the system has multiple CPU cores, threads can run in **parallel**.
 * - So, multithreading provides concurrency by default, and may provide parallelism
 *   if hardware (multi-core CPU) allows.
 *
 * Summary Table:
 * ---------------
 * | Term           | Description                                          |
 * |----------------|------------------------------------------------------|
 * | Concurrency    | Tasks take turns; may appear simultaneous            |
 * | Parallelism    | Tasks run at the same time on different cores        |
 * | Multithreading | Program with multiple threads                        |
 *
 * Conclusion:
 * ------------
 * - **Concurrency** is about dealing with multiple tasks at once, even on a single core.
 * - **Parallelism** is about executing multiple tasks at the same exact time using multiple cores.
 * - **Multithreading** is a technique to perform multiple tasks within a program.
 * - Multithreading always gives concurrency.
 * - It gives parallelism **only if** multiple CPU cores are available.
 *
 */


package com.surja.multiThreading;

public class ConcurrencyVsParallelism {
}
