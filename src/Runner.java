public class Runner extends Thread {

    String r1="Runner:1 ";
    String r2="Runner:2 ";
    String r3="Runner:3 ";
    String r4="Runner:4 ";
    String r5="Runner:5 ";
    public Runner(String name){
    }
    public void run() {
        try {
            System.out.println(r1+ " Берёт палочку  ");
            System.out.println(r1 + " Бежит к " + r2);
            sleep(5000);

            System.out.println(r2+"Берёте палочку ");
            System.out.println(r2+"Бежит к " + r3);
            sleep(5000);

            System.out.println(r3+"Берёте палочку ");
            System.out.println(r3+"Бежит к " + r4);
            sleep(5000);

            System.out.println(r4+"Берёте палочку ");
            System.out.println(r4+"Бежит к " + r5);
            sleep(5000);

            System.out.println(r5+"Берёте палочку ");
            System.out.println(r5+"Бежит к " + r4);
            sleep(5000);

            System.out.println(r4+"Берёте палочку ");
            System.out.println(r4+"Бежит к " + r3);
            sleep(5000);

            System.out.println(r3+"Берёте палочку ");
            System.out.println(r3+"Бежит к " + r2);
            sleep(5000);

            System.out.println(r2+"Берёте палочку ");
            System.out.println(r2+"Бежит к " + r1);
            sleep(5000);

            System.out.println(r1+"Берёте палочку ");


        } catch (InterruptedException ie) {
        }

    }
}

