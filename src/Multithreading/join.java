package Multithreading;
//When the join() method is invoked, the current thread stops its execution
// and the thread goes into the wait state. The current thread remains in the wait state
// until the thread on which the join() method is invoked has achieved its dead state.
public class join extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                System.out.println("Current thread name :"+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        join obj1 = new join();
        join obj2 = new join();
        join obj3 = new join();
        obj1.start();
        obj1.setName("Thread phla");
        try {
            obj1.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        obj2.start();
        obj2.setPriority(9);
        obj3.start();
        obj3.setPriority(5);
    }
}
