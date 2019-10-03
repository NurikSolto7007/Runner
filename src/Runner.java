public class Runner extends Thread {

    Runner nextRunner;

    public Runner(String name) {
        this.setName(name);
    }
    public void run() {
        System.out.println(this.getName() + " Берёт палочку  ");
        try {
            System.out.println(this.getName() + " Бежит к " + nextRunner.getName());
            sleep(5000);
        } catch (InterruptedException ie) {
        }
    }
}

