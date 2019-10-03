public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Старт " + Thread.currentThread().getName());
        Runner r1 = new Runner("Runner1");
        Runner r2 = new Runner("Runner2");
        Runner r3 = new Runner("Runner3");
        Runner r4 = new Runner("Runner4");
        Runner r5 = new Runner("Runner5");

        r1.nextRunner = r2;
        r2.nextRunner = r3;
        r3.nextRunner = r4;
        r4.nextRunner = r5;
        r5.nextRunner = r4;




        r1.start();
        r1.join();

        r2.start();
        r2.join();

        r3.start();
        r3.join();

        r4.start();
        r4.join();

        r5.start();
        r5.join();


    }

}