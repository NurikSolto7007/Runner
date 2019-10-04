public class Main {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread();
        System.out.println("Старт " + thread.currentThread().getName());
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        Runner r3 = new Runner();
        Runner r4 = new Runner();
        Runner r5 = new Runner();

         Thread run1 = new Thread(r1,"Runner:1");
         Thread run2 = new Thread(r2,"Runner:2");
         Thread run3 = new Thread(r3,"Runner:3");
         Thread run4 = new Thread(r4,"Runner:4");
         Thread run5 = new Thread(r5,"Runner:5");
        r1.start();
        r1.join();
        r2.start();
        r2.join();
        r3.start();
        r3.join();
        r4.start();
        r4.join();
        r5.start();

    }

}