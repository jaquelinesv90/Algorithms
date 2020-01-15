package algorithms.bingo;
import java.util.Timer;
import java.util.TimerTask;


public  class SetTimerBingo extends TimerTask {

    @Override
    public void run() {
        completeTask();
    }

    private static void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void Init(){
        TimerTask timerTask = new SetTimerBingo();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 10*1000);
        //cancel after sometime
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        /*
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
    }
}