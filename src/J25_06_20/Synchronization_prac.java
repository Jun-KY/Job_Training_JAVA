package J25_06_20;
class Counter{
    private int count = 0;

    public synchronized void increment(){ //synchronized -> 스래드를 끝값까지 정렬
        //Thread 를 순서대로 한번에 하나씩 번갈아 가며작업
        count++;
    }
    public int getCount(){
        return count;
    }
}
public class Synchronization_prac {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            for(int i = 0; i < 10000; i++){
                counter.increment();
            }
        };
        Thread[] threads = new Thread[5];
        for(int i = 0; i < 5; i++){
            threads[i] = new Thread(task);
            threads[i].start();
        }
        for(Thread t: threads){
            t.join();
        }
            System.out.println("Final count: " + counter.getCount());
    }
}
