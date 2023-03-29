# Multithreading

### Multitasking

1. Process Based Multitasking
2. Thread Based Multitasking

## Process Based Multitasking

Allows programs to run concurrently on the computer.  
Eg: Running the ms paint while also working with word processor.

## Thread Based Multitasking

Allows part of the same program to run concurrently on the computer.  
Eg: Ms Word that is printing and formating text at the same time.

## Thread Vs Process

* Two threads share the same address space.
* Context switching between two threads is usually less expensive than between process.
* The cost of communication between the threads is relatively low. 

## Why Multithreading?

* In a single threaded environment, only one task at a time can be performed. 
* CPU cycles are wasted. For example, when waiting for user input. 
* Multitasking allows idle CPU to be put to good use. 

## Thread

* A thread is an indepent sequencial path of execution  within a program. 
* Many threads can run concurrently  within a program. 
* At runtime, threads in a program exist in common memory space  
  and can therefore, share both data and code (i.e., they are lightweight compared to processors). 
* They also share the process running the program. 
* 3 important concepts related to multithreading in java 
  * Creating threads and providing the code that gets executed by a thread. 
  * Accessing common data and code through synchonization. 
  * Transitioning between thread states.  

## The Main Thread

* When  a standalone application is run, a user thread is automatically created to execute the main()  
 method of the application. This thread is called the main thread. 
* If no other user threads are spawned, the program terminates when the main() method is finished executing. 
* All other threads called child threads are spawned from the main thread itself. 
* The main method can then finish, but the program will keep running until all user threads have completed. 
* The runtime environment distinguishes between user threads and daemon threads. 
* Calling the setDaemon(boolean) method in the thread class marks the status of the thread as either daemon or user,
  but this must be done before the thread is started. 
* As long as a user thread is alive, the JVM doesn't terminate. 
* A daemon thread is at the mercy of the runtime system: It stops if there is no more user thread running, 
  thus terminating the program. 

## Thread Creation

* A thread in java is represented by an object of the `Thread` class. 
* Creating thread is achieved in one of the two ways. 
  * Implementing the `java.lang.Runnable` interface. 
  * Extending the `java.lang.Thread` class
