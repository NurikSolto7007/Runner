public class Main {

    public static void main(String[] args){
        Thread thread=new Thread();
             System.out.println("Старт " + thread.currentThread().getName());
             Runner runner=new Runner();
             runner.start();








    }

}