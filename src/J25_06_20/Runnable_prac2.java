package J25_06_20;
//class MR implements Runnable{}

public class Runnable_prac2 {
    public static void main(String[] args){
        new Thread(()->{
            System.out.println("Runnable 실행중");

            for (int i = 1; i <= 5; i ++){
                try{
                    Thread.sleep(1000);

                    System.out.println(i);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}
