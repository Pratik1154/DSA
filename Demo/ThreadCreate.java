package Demo;

// public class ThreadCreate {
//     public static void main(String[] args) {
//         Mythread t1 = new Mythread();
//         t1.start();
//     }
// }

// class Mythread extends Thread{
//     @Override 
//     public void run(){
//         System.out.println("Thread is Running..");
//     }
// }

// public class ThreadCreate {
// public static void main(String[] args) {
//     Mythread obj = new Mythread();
//     Thread t1 = new Thread(obj);
//     t1.start();
//     }
// }
// class Mythread implements Runnable{
//     public void run(){
//         System.out.println("Thread is Running");
//     }
// }

/**
 * ThreadCreate
 */
public class ThreadCreate {

    public static void main(String[] args) {
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getId());

        Thread t1 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
            System.out.println("thread1 is running");

        });

        Thread t2 = new Thread(() -> {

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getId());
            System.out.println("thread2 is running");

        });
        t1.start();
        t2.start();
    }
}
