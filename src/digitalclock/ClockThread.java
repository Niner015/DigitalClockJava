package digitalclock;

import java.util.Date;
/**
 * Created by alamm7 on 10/5/17.
 */
public class ClockThread  extends Thread{

    Main digitalclock;
    String time;

    public ClockThread (Main digitalclock){

        this.digitalclock = digitalclock;
        start();
    }

    public void run (){
        while(true) {

            time = "" + new Date();
            digitalclock.jlabClock.setText(time);
        }
    }
}
