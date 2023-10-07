//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
// At least one process is required for each thread.
//1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.
//2) You can perform many operations together, so it saves time.
//3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
package Multithreading;
class Thead0 extends Thread{
    public void run(){
        System.out.println("Hello");
        try {
            for (int i = 0; i < 5; i++) {
                Thead0.sleep(500);
                System.out.println(i);
            }
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class Thread1 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        Thread1 obj=new Thread1();
        Thread obj2=new Thread(obj,"Thread0001");
        obj2.start();
        System.out.println(obj2.getName());
        Thead0 obj0=new Thead0();
        obj0.start();
        Thead0 ob=new Thead0();
        ob.start();
        //After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown.
    }
}
