/*
 * ==============================================================================
 *                        RACE CONDITION IN MULTITHREADING (JAVA)
 * ==============================================================================
 *
 * A race condition occurs when **two or more threads access shared data** at the same time,
 * and the final result depends on the **timing and interleaving** of thread execution.
 *
 * Problem:
 * - When threads read and write shared variables without proper synchronization,
 *   they can interfere with each other.
 * - This leads to inconsistent or incorrect results.
 *
 * Example Scenario:
 * - Multiple threads incrementing a shared counter.
 */


package com.surja.multiThreading.synchronization;

public class RaceCondition {
}
