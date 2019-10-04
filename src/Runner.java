public class Runner extends Thread {
Thread r1 = new Thread(" Runner:1 ");
Thread r2 = new Thread(" Runner:2 ");
Thread r3 = new Thread(" Runner:3 ");
Thread r4 = new Thread(" Runner:4 ");
Thread r5 = new Thread(" Runner:5 ");

    public void run() {
        try {
            System.out.println(r1.getName()+ " Берёт палочку  ");
            System.out.println(r1.getName() + " Бежит к " + r2.getName());
            r1.sleep(1);
            r1.join();
            System.out.println(r2.getName()+"Берёте палочку ");
            System.out.println(r2.getName()+"Бежит к " + r3.getName());
            r2.sleep(1);
            r2.join();
            System.out.println(r3.getName()+"Берёте палочку ");
            System.out.println(r3.getName()+"Бежит к " + r4.getName());
            r3.sleep(1);
            r3.join();
            System.out.println(r4.getName()+"Берёте палочку ");
            System.out.println(r4.getName()+"Бежит к " + r5.getName());
            r4.sleep(1);
            r4.join();
            System.out.println(r5.getName()+"Берёте палочку ");
            System.out.println(r5.getName()+"Бежит к " + r4.getName());
            r5.sleep(1);
            r5.join();
            System.out.println(r4.getName()+"Берёте палочку ");
            System.out.println(r4.getName()+"Бежит к " + r3.getName());
            r4.sleep(1);
            r4.join();
            System.out.println(r3.getName()+"Берёте палочку ");
            System.out.println(r3.getName()+"Бежит к " + r2.getName());
            r3.sleep(1);
            r3.join();
            System.out.println(r2.getName()+"Берёте палочку ");
            System.out.println(r2.getName()+"Бежит к " + r1.getName());
            r2.sleep(1);
            r2.join();
            System.out.println(r1.getName()+"Берёте палочку ");
            r1.sleep(5000);
            r1.join();
        } catch (InterruptedException ie) {
        }

    }
}

