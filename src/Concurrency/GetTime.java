package Concurrency;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime extends Thread {

    Date righNow;
    Locale currentLocale;
    DateFormat timeFormatter;
    DateFormat dateFormatter;
    String timeOutput;
    String dateOutput;

    public void run(){

        while(true){
            righNow = new Date();
            currentLocale = new Locale("nl");

            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);

            timeOutput = timeFormatter.format(righNow);
            dateOutput = dateFormatter.format(righNow);

            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
