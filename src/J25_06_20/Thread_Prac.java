package J25_06_20;

import java.util.Timer;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
//            System.out.println("My thread: " + i);
            System.out.println((i)+"seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { //예외 처리
                System.out.println(e.getMessage() + "wake up?");

            }
        }
    }
}

public class Thread_Prac{
    public static void main(String[] args){
        MyThread thread = new MyThread();
        thread.start();

    }
}