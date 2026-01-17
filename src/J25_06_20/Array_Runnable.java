package J25_06_20;
class SumRunnable implements Runnable{
    private final int[] numbers;

    public SumRunnable(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;

        for (int n: numbers){
            sum += n;
            try{Thread.sleep(100);} catch (InterruptedException e){
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " - Sum: " +sum);
    }
}
public class Array_Runnable {
    public static void main(String[] args){
        int[][] datasets = {
                {1, 2, 3, 4, 5},
                {10, 20, 30},
                {7, 14, 21, 28},
                {100, 200, 300, 400}
        };
        for (int i = 0; i <datasets.length; i++){
            Thread sumThread = new Thread(new SumRunnable(datasets[i]));
            sumThread.start(); //동시에 시작해서 결과 도산순서는 랜덤
//            sumThread.run();

        }
    }
}
