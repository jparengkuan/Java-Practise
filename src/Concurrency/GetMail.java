package Concurrency;

public class GetMail implements Runnable {

    private int startTime;

    public GetMail(int startTime) {
        this.startTime = startTime;
    }

    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(startTime * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Checking mail");
        }

    }
}
