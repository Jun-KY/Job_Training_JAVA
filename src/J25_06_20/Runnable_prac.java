package J25_06_20;
class MyRunnable implements Runnable{
    @Override
    public void run() {

        for(int i = 0; i <= 5; i++){
            try {
                Thread.sleep(1000);

                System.out.println(i);
            } catch (InterruptedException e) {
//            throw new RuntimeException(e);
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Runnable_prac {
    public static void main(String[]args){
        Thread thread = new Thread(new MyRunnable(), "CountThread");

        thread.start();

        System.out.println(thread.getName());
    }
}
