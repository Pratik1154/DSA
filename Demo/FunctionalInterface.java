package Demo;

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 50; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 50; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter {
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class FunctionalInterface {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 =()->
         {
        for (int i = 0; i <= 1000; i++) {
            c.increment();
        }
    };
        Runnable obj2 = ()->{
        for (int i = 0; i <= 1000; i++) {
           c.increment();
        } 
    };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}