public class Main {

    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Thread();
        System.out.println("Старт " + thread.currentThread().getName());
        final Thread r1 = new Runner("Runner:1");
        final Thread r2 = new Runner("Runner:2");
        final Thread r3 = new Runner("Runner:3");
        final Thread r4 = new Runner("Runner:4");
        final Thread r5 = new Runner("Runner:5");
        r1.start();


    }

}