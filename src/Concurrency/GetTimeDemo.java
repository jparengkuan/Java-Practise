package Concurrency;

public class GetTimeDemo {

    public static void main(String[] args) {

        Thread getTime = new GetTime();

        Runnable getMail = new GetMail(10);

        getTime.start();

        new Thread(getMail).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(true) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    i++;
                    System.out.println(i);
                }
            }
        }).start();

    }
}
