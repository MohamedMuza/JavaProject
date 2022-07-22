public class Threads_Java extends Thread{

    private int threadNum;
    public Threads_Java(int threadNum){
        this.threadNum = threadNum;
    }
    @Override
    public void run() {
        for (int i = 1; i <=3; i++) {
            System.out.println(i + " from thread " + threadNum);
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Multiple threads
        for (int i = 1; i <=3 ; i++) {
            Threads_Java My_thread = new Threads_Java(i);
            My_thread.start();
            // To Run One thread at a time
            My_thread.join();
        }


    }
}
