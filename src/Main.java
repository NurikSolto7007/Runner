public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        System.out.println("Старт " + thread.currentThread().getName());
        Runner runner = new Runner("Runner");
        final Thread r1 = new Thread(new Runner("Runner:1"));
        final Thread r2 = new Thread(("Runner:2"));
        final Thread r3 = new Thread(("Runner:3"));
        final Thread r4 = new Thread("Runner:4");
        final Thread r5 = new Thread(("Runner:5"));
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();


    }
}