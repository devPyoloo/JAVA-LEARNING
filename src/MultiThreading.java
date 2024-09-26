public class MultiThreading implements Runnable {
    private int threadNumber;
    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
           if(Thread.currentThread().isInterrupted()) { //Handle the interruption (e.g., stop execution)
               System.out.println(threadNumber + " is was interrupted");
               break;
           }
                System.out.println(i + " is running from Thread:" +threadNumber);


            try {
                Thread.sleep(1000); // delay before next thread.
            } catch (InterruptedException e) {
//
                System.out.println(threadNumber+" Thread was interrupted during ssleep");
                Thread.currentThread().isInterrupted();
                break;
            }
        }
    }
}
